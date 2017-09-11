package br.unipe.p6.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.p6.helpdesk.model.UsuarioTecnico;

public class UsuarioTecnicoDao extends AbstractDao<UsuarioTecnico> {

	public UsuarioTecnicoDao(EntityManager manager) {
		super(manager);
	}

}
