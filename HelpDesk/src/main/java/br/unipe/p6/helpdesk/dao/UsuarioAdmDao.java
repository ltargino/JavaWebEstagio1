package br.unipe.p6.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.p6.helpdesk.model.UsuarioAdm;

public class UsuarioAdmDao extends AbstractDao<UsuarioAdm> {

	public UsuarioAdmDao(EntityManager manager) {
		super(manager);
	}

}
