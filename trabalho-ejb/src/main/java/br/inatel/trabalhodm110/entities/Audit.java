package br.inatel.trabalhodm110.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "AUDIT")
public class Audit implements Serializable{

	/**
	 *
	 */
	private static final long serialVersionUID = 5164212251603287736L;
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private long id;
	
	@Column(name = "REGISTER_CODE")
	private int registerCode;
	
	@Column(name = "OPERATION")
	private String operation;
	
	@Column(name = "TIME_STAMP")
	private LocalDateTime timestamp;

	public LocalDateTime getTimestamp()
	{
		return timestamp;
	}

	public Audit setTimestamp(LocalDateTime timestamp) 
	{
		this.timestamp = timestamp;
		return this;
	}

	public int getRegisterCode() 
	{
		return registerCode;
	}

	public Audit setRegisterCode(int registerCode) 
	{
		this.registerCode = registerCode;
		return this;
	}

	public String getOperation() 
	{
		return operation;
	}

	public Audit setOperation(String operation)
	{
		this.operation = operation;
		return this;
	}
}
