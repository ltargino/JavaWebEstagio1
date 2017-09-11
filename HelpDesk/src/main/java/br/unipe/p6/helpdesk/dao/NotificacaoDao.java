package br.unipe.p6.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.p6.helpdesk.model.Notificacao;

public class NotificacaoDao extends AbstractDao<Notificacao> {

	public NotificacaoDao(EntityManager manager) {
		super(manager);
	}

}
