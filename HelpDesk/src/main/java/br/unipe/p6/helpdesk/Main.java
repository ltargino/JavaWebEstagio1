package br.unipe.p6.helpdesk;

import java.util.ArrayList;

import br.unipe.p6.helpdesk.controller.DepartamentoController;
import br.unipe.p6.helpdesk.model.Departamento;
import br.unipe.p6.helpdesk.model.UsuarioCliente;

public class Main {

	public static void main(String[] args) {

		Departamento departamento = new Departamento("Departamento A", "Descrição do Departamento A", new ArrayList<UsuarioCliente>());
		Departamento departamento2 = new Departamento("Departamento B", "Descrição do Departamento B", new ArrayList<UsuarioCliente>());
		
		DepartamentoController controller = new DepartamentoController();
		
		controller.salvar(departamento);
		controller.salvar(departamento2);
		
		controller.deletar(departamento2);
		
	}

}
