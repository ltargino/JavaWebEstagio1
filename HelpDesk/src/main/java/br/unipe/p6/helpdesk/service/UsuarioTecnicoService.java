package br.unipe.p6.helpdesk.service;


import br.unipe.p6.helpdesk.model.Usuario;
import br.unipe.p6.helpdesk.dao.UsuarioTecnicoDao;
import br.unipe.p6.helpdesk.model.UsuarioTecnico;


public class UsuarioTecnicoService extends AbstractService <UsuarioTecnicoDao,  UsuarioTecnico> {
	
	public Boolean validarUsuario (Usuario usuario) {
		return false;}
}