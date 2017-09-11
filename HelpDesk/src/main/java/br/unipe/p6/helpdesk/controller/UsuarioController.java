package br.unipe.p6.helpdesk.controller;

import java.util.ArrayList;
import java.util.List;
import br.unipe.p6.helpdesk.model.Usuario;


public class UsuarioController {
	
	public Usuario salvar (Usuario usuario) {
		return usuario;}
	
	public Boolean deletar (Usuario usuario) {
		return false;}
	
	public List<Usuario> listar (){
		return new ArrayList<Usuario> ();}

}
