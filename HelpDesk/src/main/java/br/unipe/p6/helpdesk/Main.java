package br.unipe.p6.helpdesk;

import br.unipe.p6.helpdesk.model.Departamento;
import br.unipe.p6.helpdesk.model.Prioridade;
import br.unipe.p6.helpdesk.model.Status;
import br.unipe.p6.helpdesk.model.Ticket;
import br.unipe.p6.helpdesk.model.Usuario;
import br.unipe.p6.helpdesk.model.UsuarioCliente;

public class Main {

	public static void main(String[] args) {

		//Baixo acoplamento
		Departamento departamento = new Departamento("RH", "Recursos Humanos", null);
		Usuario usuario = new UsuarioCliente(departamento, "123456", "Larissa", "l.targino@hotmail.com"); 

		//Expert + Alta coesão
		Ticket ticket = new Ticket("Problema na impressora", "A impressora não esta querendo imprimir", Prioridade.MEDIA, usuario, Status.ABERTO);
		ticket.enviarEmail();
		
		//Creator
		ticket.setPrioridade(Prioridade.ALTA);
		
	}

}
