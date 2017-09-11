package br.unipe.p6.helpdesk.service;


import br.unipe.p6.helpdesk.dao.UsuarioClienteDao;
import br.unipe.p6.helpdesk.model.Usuario;
import br.unipe.p6.helpdesk.model.UsuarioCliente;


public class UsuarioClienteService extends AbstractService <UsuarioClienteDao,  UsuarioCliente> {
	
	public Boolean validarUsuario (Usuario usuario) {
		return false;}
}