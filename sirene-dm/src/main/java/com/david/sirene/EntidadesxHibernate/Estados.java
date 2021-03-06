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
 * Estados generated by hbm2java
 */
@Entity
@Table(name = "estados", catalog = "bd_sianglv", uniqueConstraints = @UniqueConstraint(columnNames = "estado_nombre"))
public class Estados implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4000929245841749439L;
	private Integer estadoId;
	private String estadoNombre;
	private String estadoCodigo;
	private Set<Estudiantes> estudianteses = new HashSet<Estudiantes>(0);
	private Set<Matricula> matriculasForMatriCondicionAnterior = new HashSet<Matricula>(
			0);
	private Set<Matricula> matriculasForMatriSituacionAnterior = new HashSet<Matricula>(
			0);

	public Estados() {
	}

	public Estados(String estadoNombre, String estadoCodigo) {
		this.estadoNombre = estadoNombre;
		this.estadoCodigo = estadoCodigo;
	}

	public Estados(String estadoNombre, String estadoCodigo,
			Set<Estudiantes> estudianteses,
			Set<Matricula> matriculasForMatriCondicionAnterior,
			Set<Matricula> matriculasForMatriSituacionAnterior) {
		this.estadoNombre = estadoNombre;
		this.estadoCodigo = estadoCodigo;
		this.estudianteses = estudianteses;
		this.matriculasForMatriCondicionAnterior = matriculasForMatriCondicionAnterior;
		this.matriculasForMatriSituacionAnterior = matriculasForMatriSituacionAnterior;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "estado_id", unique = true, nullable = false)
	public Integer getEstadoId() {
		return this.estadoId;
	}

	public void setEstadoId(Integer estadoId) {
		this.estadoId = estadoId;
	}

	@Column(name = "estado_nombre", unique = true, nullable = false, length = 50)
	public String getEstadoNombre() {
		return this.estadoNombre;
	}

	public void setEstadoNombre(String estadoNombre) {
		this.estadoNombre = estadoNombre;
	}

	@Column(name = "estado_codigo", nullable = false, length = 10)
	public String getEstadoCodigo() {
		return this.estadoCodigo;
	}

	public void setEstadoCodigo(String estadoCodigo) {
		this.estadoCodigo = estadoCodigo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estados")
	public Set<Estudiantes> getEstudianteses() {
		return this.estudianteses;
	}

	public void setEstudianteses(Set<Estudiantes> estudianteses) {
		this.estudianteses = estudianteses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadosByMatriCondicionAnterior")
	public Set<Matricula> getMatriculasForMatriCondicionAnterior() {
		return this.matriculasForMatriCondicionAnterior;
	}

	public void setMatriculasForMatriCondicionAnterior(
			Set<Matricula> matriculasForMatriCondicionAnterior) {
		this.matriculasForMatriCondicionAnterior = matriculasForMatriCondicionAnterior;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estadosByMatriSituacionAnterior")
	public Set<Matricula> getMatriculasForMatriSituacionAnterior() {
		return this.matriculasForMatriSituacionAnterior;
	}

	public void setMatriculasForMatriSituacionAnterior(
			Set<Matricula> matriculasForMatriSituacionAnterior) {
		this.matriculasForMatriSituacionAnterior = matriculasForMatriSituacionAnterior;
	}

}
