package com.david.sirene.EntidadesxHibernate;

// Generated 15/01/2014 11:40:41 AM by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Sisben generated by hbm2java
 */
@Entity
@Table(name = "sisben", catalog = "bd_sianglv", uniqueConstraints = @UniqueConstraint(columnNames = "sisben_nombre"))
public class Sisben implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8138444850425212870L;
	private Integer sisbenId;
	private String sisbenNombre;
	private Set<Estudiantes> estudianteses = new HashSet<Estudiantes>(0);

	public Sisben() {
	}

	public Sisben(String sisbenNombre) {
		this.sisbenNombre = sisbenNombre;
	}

	public Sisben(String sisbenNombre, Set<Estudiantes> estudianteses) {
		this.sisbenNombre = sisbenNombre;
		this.estudianteses = estudianteses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "sisben_id", unique = true, nullable = false)
	public Integer getSisbenId() {
		return this.sisbenId;
	}

	public void setSisbenId(Integer sisbenId) {
		this.sisbenId = sisbenId;
	}

	@Column(name = "sisben_nombre", unique = true, nullable = false, length = 10)
	public String getSisbenNombre() {
		return this.sisbenNombre;
	}

	public void setSisbenNombre(String sisbenNombre) {
		this.sisbenNombre = sisbenNombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sisben")
	public Set<Estudiantes> getEstudianteses() {
		return this.estudianteses;
	}

	public void setEstudianteses(Set<Estudiantes> estudianteses) {
		this.estudianteses = estudianteses;
	}

}