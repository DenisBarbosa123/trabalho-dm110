package br.inatel.trabalhodm110.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PAYMENT")
public class Payment implements Serializable {

	private static final long serialVersionUID = 5938979026494446541L;
	
	@Id
	@Column(name = "PRODUCT_CODE")
	private int productCode;
	
	@Column(name = "PAYMENT_DATE")
	private String paymentDate;
	
	@Column(name = "DUE_DATE")
	private String dueDate;
	
	@Column(name = "VALUE")
	private double value;
	
	@Column(name = "PAYMENT_TYPE")
	private String paymentType;
	
	public int getProductCode() 
	{
		return productCode;
	}
	
	public Payment setProductCode(int productCode) 
	{
		this.productCode = productCode;
		return this;
	}
	
	public String getPaymentDate() 
	{
		return paymentDate;
	}
	
	public Payment setPaymentDate(String paymentDate) 
	{
		this.paymentDate = paymentDate;
		return this;
	}
	public String getDueDate() 
	{
		return dueDate;
	}
	
	public Payment setDueDate(String dueDate) 
	{
		this.dueDate = dueDate;
		return this;
	}
	
	public double getValue() 
	{
		return value;
	}
	
	public Payment setValue(double value) 
	{
		this.value = value;
		return this;
	}
	
	public String getPaymentType() 
	{
		return paymentType;
	}
	
	public Payment setPaymentType(String paymentType) 
	{
		this.paymentType = paymentType;
		return this;
	}
}
