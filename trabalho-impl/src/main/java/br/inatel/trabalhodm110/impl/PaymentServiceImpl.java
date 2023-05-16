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
		log.info("Save payment");
		paymentBean.savePayment(paymentTO);
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
