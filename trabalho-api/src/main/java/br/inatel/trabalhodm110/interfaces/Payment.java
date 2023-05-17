package br.inatel.trabalhodm110.interfaces;

import java.util.List;

import br.inatel.trabalhodm110.api.PaymentTO;

public interface Payment 
{
	public void savePayment(PaymentTO paymentTO);
	
	public PaymentTO getPayment(Integer id);
	
	public void updatePayment(Integer id, PaymentTO paymentTO);

	public List<PaymentTO> getAllPayments();
}