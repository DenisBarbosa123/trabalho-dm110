package br.inatel.trabalhodm110.beans;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.EJB;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

import br.inatel.trabalhodm110.api.AuditTO;
import br.inatel.trabalhodm110.interfaces.AuditLocal;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/jms/queue/dm110queue") })

public class PaymentQueueMDB implements MessageListener 
{
	private static Logger log = Logger.getLogger(PaymentQueueMDB.class.getName());
	
	@EJB
	AuditLocal auditBean;

	@Override
	public void onMessage(Message message) 
	{
		log.info("Message received on queue to be processed");
		if (message instanceof ObjectMessage) 
		{
			try 
			{
				AuditTO auditTO = message.getBody(AuditTO.class);
				auditBean.saveAudit(auditTO);
				log.info("Message received on queue: " + auditTO);
			} 
			catch (JMSException e) 
			{
				e.printStackTrace();
			}
		}
	}
}
