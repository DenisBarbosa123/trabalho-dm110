package br.inatel.trabalhodm110.api;

import java.io.Serializable;

public class AuditTO implements Serializable
{
	private static final long serialVersionUID = 4552941835287779193L;

	private int registerCode;
	private String operation;
	
	public int getRegisterCode() 
	{
		return registerCode;
	}
	
	public AuditTO setRegisterCode(int registerCode) 
	{
		this.registerCode = registerCode;
		return this;
	}
	
	public String getOperation() 
	{
		return operation;
	}
	
	public AuditTO setOperation(String operation) 
	{
		this.operation = operation;
		return this;
	}
}
