package br.unipe.p6.helpdesk.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SLA implements IModel{
	
	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	//constructor
	public SLA(Long id) {
		super();
		this.id = id;
	}

	//Gets e Sets
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
