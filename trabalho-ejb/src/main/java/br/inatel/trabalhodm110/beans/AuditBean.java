package br.inatel.trabalhodm110.beans;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.inatel.trabalhodm110.api.AuditTO;
import br.inatel.trabalhodm110.entities.Audit;
import br.inatel.trabalhodm110.interfaces.AuditLocal;

@Stateless	
@Local(AuditLocal.class)
public class AuditBean implements AuditLocal
{
	@PersistenceContext(unitName = "payment_pu")
	private EntityManager em;
	
	@EJB
	private PaymentQueueSender queueSender;

	@Override
	public void saveAudit(AuditTO auditTO) {
		Audit audit = new Audit()
				.setRegisterCode(auditTO.getRegisterCode())
				.setOperation(auditTO.getOperation());
		em.persist(audit);
	}
}
