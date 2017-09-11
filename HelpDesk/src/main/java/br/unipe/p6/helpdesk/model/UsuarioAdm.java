package br.unipe.p6.helpdesk.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id") 
public class UsuarioAdm extends Usuario {

	public UsuarioAdm(String senha, String nome, String email, Long id) {
		super(senha, nome, email, id);
	}

}
