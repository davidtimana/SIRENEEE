package com.david.sirene.controllers;

import com.david.sirene.bo.PruebaBO;
import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/*
 * @author Eyder Albeiro Ascuntar Rosales
 */

@ManagedBean(name="pruebaBean")
@SessionScoped
public class PruebaBean implements Serializable {

	private static final long serialVersionUID = 6437541572047498821L;
        
	

	private String firstname;

	private String surname;
        
        @PostConstruct
        public void init(){
            System.out.println("***** Iniciando PruebaBean");
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

	public void savePerson() {
            System.out.println("entre al save person");
		/*Prueba pr = new Prueba(firstname, surname);
		if (pruebaBO.pruebaBO(pr) == true) {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage("Bienvenido " + firstname + " " + surname
							+ "!"));
		} else {
			FacesContext.getCurrentInstance().addMessage(
					null,
					new FacesMessage("Error al registrar Usuario  " + firstname
							+ " " + surname + "!"));
		}*/
	}
}
