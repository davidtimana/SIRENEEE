package com.david.sirene.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@Entity
@Table(name = "TBL_PRUEBA")
public class Prueba {

	@Id
	@GeneratedValue
	private long Id;
	private String firstname;
	private String surname;

	public Prueba() {
	}

	public Prueba(String firstname, String surname) {
		super();
		this.firstname = firstname;
		this.surname = surname;
	}

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

}
