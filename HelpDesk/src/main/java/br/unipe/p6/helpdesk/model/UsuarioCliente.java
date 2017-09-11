package br.unipe.p6.helpdesk.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

@Entity
@PrimaryKeyJoinColumn(name="id") 
public class UsuarioCliente extends Usuario{

	@ManyToOne
	private Departamento departamento;
	
	//constructor
	public UsuarioCliente(Departamento departamento, String senha, String nome, String email, Long id) {
		super(senha, nome, email, id);
		this.departamento = departamento;
	}
	
	//gets e sets
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	
}
