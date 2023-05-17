package br.inatel.trabalhodm110.beans;

import java.util.List;
import java.util.stream.Collectors;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import br.inatel.trabalhodm110.api.PaymentTO;
import br.inatel.trabalhodm110.entities.Payment;
import br.inatel.trabalhodm110.interfaces.PaymentLocal;

@Stateless	
@Local(PaymentLocal.class)
public class PaymentBean implements PaymentLocal
{
	@PersistenceContext(unitName = "payment_pu")
	private EntityManager em;
	
	@Override
	public void savePayment(PaymentTO paymentTO) 
	{
		Payment payment = new Payment()
				.setProductCode(paymentTO.getProductCode())
				.setDueDate(paymentTO.getDueDate())
				.setPaymentDate(paymentTO.getPaymentDate())
				.setValue(paymentTO.getValue())
				.setPaymentType(paymentTO.getPaymentType());
		em.persist(payment);
	}

	@Override
	public PaymentTO getPayment(Integer id) 
	{
		Payment payment = em.find(Payment.class, id);
		return toPaymentTO(payment);
	}

	@Override
	public void updatePayment(Integer id, PaymentTO paymentTO) 
	{
		Payment payment = em.find(Payment.class, id);
		
		payment.setDueDate(paymentTO.getDueDate());
		payment.setPaymentDate(paymentTO.getPaymentDate());
		payment.setValue(paymentTO.getValue());
		payment.setPaymentType(paymentTO.getPaymentType());
		
		em.merge(payment);
	}

	@Override
	public List<PaymentTO> getAllPayments() 
	{
		TypedQuery<Payment> query = em.createQuery("select p from Payment p", Payment.class);
		
		return toCollectionAPIModel(query.getResultList());
	}
	
	private List<PaymentTO> toCollectionAPIModel(List<Payment> paymentList) 
	{
		return paymentList
				.stream()
				.map(PaymentBean::toPaymentTO)
				.collect(Collectors.toList());
	}
	
	public static PaymentTO toPaymentTO(Payment payment) {
		return new PaymentTO()
				.setProductCode(payment.getProductCode())
				.setDueDate(payment.getDueDate())
				.setPaymentDate(payment.getPaymentDate())
				.setValue(payment.getValue())
				.setPaymentType(payment.getPaymentType());
	}
}
