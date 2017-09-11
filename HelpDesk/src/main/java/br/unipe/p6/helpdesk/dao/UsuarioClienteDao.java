package br.unipe.p6.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.p6.helpdesk.model.UsuarioCliente;

public class UsuarioClienteDao extends AbstractDao<UsuarioCliente> {

	public UsuarioClienteDao(EntityManager manager) {
		super(manager);
	}

}
