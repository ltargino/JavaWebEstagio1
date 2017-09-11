package br.unipe.p6.helpdesk.controller;

import java.util.ArrayList;
import java.util.List;

import br.unipe.p6.helpdesk.model.SLA;

public class SLAController {
	
	public SLA salvar (SLA sla) {
		return sla;}
	
	public Boolean deletar (SLA sla) {
		return false;}
	
	public List <SLA> Listar () { 
		return new ArrayList<SLA>();}

}
