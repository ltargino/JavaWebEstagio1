package br.unipe.p6.helpdesk.controller;

import java.util.List;

import br.unipe.p6.helpdesk.dao.DepartamentoDao;
import br.unipe.p6.helpdesk.dao.EntityManagerUtil;
import br.unipe.p6.helpdesk.model.Departamento;
import br.unipe.p6.helpdesk.service.DepartamentoService;

public class DepartamentoController {
	
	private DepartamentoService service;

	public DepartamentoController() {
		DepartamentoDao dao = new DepartamentoDao(EntityManagerUtil.getEntityManager());
		this.service = new DepartamentoService(dao);
	}
	
	public Departamento salvar (Departamento departamento) {
		return service.salvar(departamento);
	}
	
	public Boolean deletar (Departamento departamento) {
		return service.deletar(departamento);
	}
	
	public Departamento procurarPorId(Long id) {
		return service.procurarPorId(id);
	}
	
	public List <Departamento> Listar () { 
		return service.listar();
	}

}
