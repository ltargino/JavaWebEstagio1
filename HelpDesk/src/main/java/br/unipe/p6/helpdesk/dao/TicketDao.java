package br.unipe.p6.helpdesk.dao;

import javax.persistence.EntityManager;

import br.unipe.p6.helpdesk.model.Ticket;

public class TicketDao extends AbstractDao<Ticket> {

	public TicketDao(EntityManager manager) {
		super(manager);
	}

}
