package br.unipe.p6.helpdesk.dao;

import javax.persistence.EntityManager;
import br.unipe.p6.helpdesk.model.Departamento;

public class DepartamentoDao extends AbstractDao<Departamento> {

	public DepartamentoDao(EntityManager manager) {
		super(manager);
	}

}
