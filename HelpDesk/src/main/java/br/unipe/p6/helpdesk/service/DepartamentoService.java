package br.unipe.p6.helpdesk.service;

import br.unipe.p6.helpdesk.dao.DepartamentoDao;
import br.unipe.p6.helpdesk.model.Departamento;

public class DepartamentoService extends AbstractService <DepartamentoDao,  Departamento> {
	
	public DepartamentoService(DepartamentoDao dao) {
		super.setDao(dao);
	}
	
}
