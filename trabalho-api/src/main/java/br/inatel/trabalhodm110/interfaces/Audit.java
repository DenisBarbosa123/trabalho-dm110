package br.inatel.trabalhodm110.interfaces;

import br.inatel.trabalhodm110.api.AuditTO;

public interface Audit 
{
	public void saveAudit(AuditTO auditTO);
	
}