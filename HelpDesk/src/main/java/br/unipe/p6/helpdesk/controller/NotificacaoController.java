package br.unipe.p6.helpdesk.controller;

import java.util.ArrayList;
import java.util.List;

import br.unipe.p6.helpdesk.model.Notificacao;

public class NotificacaoController {
	
	public Notificacao salvar (Notificacao notificacao) {
		return notificacao;
	}
	
	public Boolean deletar (Notificacao notificacao) {
		return false;
	}
	
	public List <Notificacao> Listar () { 
		return new ArrayList<Notificacao>();
	}
}
