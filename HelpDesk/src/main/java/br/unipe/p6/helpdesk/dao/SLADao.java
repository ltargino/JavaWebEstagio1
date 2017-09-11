package br.unipe.p6.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.p6.helpdesk.model.SLA;

public class SLADao extends AbstractDao<SLA> {

	public SLADao(EntityManager manager) {
		super(manager);
	}

}
