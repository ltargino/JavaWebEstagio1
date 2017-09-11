package br.unipe.p6.helpdesk.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id") 
public class UsuarioTecnico extends Usuario {
	
	private int nivel;

	//constructor
	public UsuarioTecnico(int nivel, String senha, String nome, String email, Long id) {
		super(senha, nome, email, id);
		this.nivel = nivel;
	}

	//gets e sets
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

}
