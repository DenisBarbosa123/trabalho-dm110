package br.inatel.trabalhodm110.beans;

import java.util.List;
import java.util.logging.Logger;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.trabalhodm110.api.PaymentTO;
import br.inatel.trabalhodm110.interfaces.PaymentLocal;

@Stateless	
@Local(PaymentLocal.class)
public class PaymentBean implements PaymentLocal
{
	private static Logger log = Logger.getLogger(PaymentBean.class.getName());
	
	@PersistenceContext(unitName = "payment_pu")
	private EntityManager em;
	
	@Override
	public void savePayment(PaymentTO paymentTO) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public PaymentTO getPayment(Integer id) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PaymentTO updatePayment(Integer id, PaymentTO paymentTO) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<PaymentTO> getAllPayments() 
	{
		// TODO Auto-generated method stub
		return null;
	}
}
