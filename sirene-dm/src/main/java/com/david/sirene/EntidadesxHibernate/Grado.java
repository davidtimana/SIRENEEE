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
 * Grado generated by hbm2java
 */
@Entity
@Table(name = "grado", catalog = "bd_sianglv", uniqueConstraints = @UniqueConstraint(columnNames = "gra_grado"))
public class Grado implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1837720634206733231L;
	private Integer graId;
	private String graGrado;
	private Set<GradoGrupo> gradoGrupos = new HashSet<GradoGrupo>(0);
	private Set<GradoMateria> gradoMaterias = new HashSet<GradoMateria>(0);

	public Grado() {
	}

	public Grado(String graGrado) {
		this.graGrado = graGrado;
	}

	public Grado(String graGrado, Set<GradoGrupo> gradoGrupos,
			Set<GradoMateria> gradoMaterias) {
		this.graGrado = graGrado;
		this.gradoGrupos = gradoGrupos;
		this.gradoMaterias = gradoMaterias;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "gra_id", unique = true, nullable = false)
	public Integer getGraId() {
		return this.graId;
	}

	public void setGraId(Integer graId) {
		this.graId = graId;
	}

	@Column(name = "gra_grado", unique = true, nullable = false, length = 20)
	public String getGraGrado() {
		return this.graGrado;
	}

	public void setGraGrado(String graGrado) {
		this.graGrado = graGrado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grado")
	public Set<GradoGrupo> getGradoGrupos() {
		return this.gradoGrupos;
	}

	public void setGradoGrupos(Set<GradoGrupo> gradoGrupos) {
		this.gradoGrupos = gradoGrupos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "grado")
	public Set<GradoMateria> getGradoMaterias() {
		return this.gradoMaterias;
	}

	public void setGradoMaterias(Set<GradoMateria> gradoMaterias) {
		this.gradoMaterias = gradoMaterias;
	}

}
