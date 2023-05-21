package br.inatel.trabalhodm110.beans;

import java.util.logging.Logger;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MessageProducer;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.Session;

import br.inatel.trabalhodm110.api.AuditTO;

@Stateless
public class PaymentQueueSender {

	@Resource(lookup = "java:/ConnectionFactory")
	private ConnectionFactory connectionFactory;

	@Resource(lookup = "java:/jms/queue/dm110queue")
	private Queue queue;
	
	private static Logger log = Logger.getLogger(PaymentQueueSender.class.getName());

	public void sendAudit(int registerCode, String operation) 
	{
		try 
		{
			log.info("Send audit message for "+ registerCode + operation);
			Connection conn = connectionFactory.createConnection();
			Session session = conn.createSession();
			MessageProducer msgProducer = session.createProducer(queue);
			
			AuditTO auditTO = new AuditTO()
					.setRegisterCode(registerCode)
					.setOperation(operation);
			ObjectMessage auditMsg = session.createObjectMessage(auditTO);
			msgProducer.send(auditMsg);
		} 
		catch (JMSException e) {
			throw new RuntimeException(e);
		}
	}
}
