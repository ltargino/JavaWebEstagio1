package br.unipe.p6.helpdesk.controller;

import java.util.ArrayList;
import java.util.List;
import br.unipe.p6.helpdesk.model.Ticket;


public class TicketController {
	
	public Ticket salvar (Ticket ticket) {
		return ticket;}
	
	public Boolean deletar (Ticket ticket) {
		return false;}
	
	public List<Ticket> listar (){
		return new ArrayList<Ticket> ();}
	

}
