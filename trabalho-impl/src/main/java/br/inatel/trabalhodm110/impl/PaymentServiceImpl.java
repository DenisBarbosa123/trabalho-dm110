package br.inatel.trabalhodm110.impl;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.inatel.trabalhodm110.api.PaymentService;
import br.inatel.trabalhodm110.api.PaymentTO;
import br.inatel.trabalhodm110.interfaces.PaymentLocal;

@RequestScoped
public class PaymentServiceImpl implements PaymentService
{
	private static Logger log = Logger.getLogger(PaymentServiceImpl.class.getName());
	
	@EJB
	private PaymentLocal paymentBean;
	
	@Override
	public void savePayment(PaymentTO paymentTO) 
	{
		log.info("Save payment " + paymentTO );
		paymentBean.savePayment(paymentTO);
	}

	@Override
	public PaymentTO getPayment(Integer id) 
	{
		log.info("Get payment by Id " + id);
		return paymentBean.getPayment(id);
	}

	@Override
	public void updatePayment(Integer id, PaymentTO paymentTO) 
	{
		log.info("Update payment " + id + paymentTO);
		paymentBean.updatePayment(id, paymentTO);
	}

	@Override
	public List<PaymentTO> getAllPayments() 
	{
		log.info("Getting all payments");
		return paymentBean.getAllPayments();
	}
}
