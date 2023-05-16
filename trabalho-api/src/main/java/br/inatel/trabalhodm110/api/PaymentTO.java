package br.inatel.trabalhodm110.api;

import java.io.Serializable;

public class PaymentTO implements Serializable
{
	private static final long serialVersionUID = 4552941835287779193L;

	private int productCode;
	private String paymentDate;
	private String dueDate;
	private double value;
	private String paymentType;
	
	public int getProductCode() 
	{
		return productCode;
	}
	
	public PaymentTO setProductCode(int productCode) 
	{
		this.productCode = productCode;
		return this;
	}
	
	public String getPaymentDate() 
	{
		return paymentDate;
	}
	
	public PaymentTO setPaymentDate(String paymentDate) 
	{
		this.paymentDate = paymentDate;
		return this;
	}
	public String getDueDate() 
	{
		return dueDate;
	}
	
	public PaymentTO setDueDate(String dueDate) 
	{
		this.dueDate = dueDate;
		return this;
	}
	
	public double getValue() 
	{
		return value;
	}
	
	public PaymentTO setValue(double value) 
	{
		this.value = value;
		return this;
	}
	
	public String getPaymentType() 
	{
		return paymentType;
	}
	
	public PaymentTO setPaymentType(String paymentType) 
	{
		this.paymentType = paymentType;
		return this;
	}
}
