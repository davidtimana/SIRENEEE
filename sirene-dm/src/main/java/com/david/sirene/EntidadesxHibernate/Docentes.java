package com.david.sirene.EntidadesxHibernate;

// Generated 15/01/2014 11:40:41 AM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Docentes generated by hbm2java
 */
@Entity
@Table(name = "docentes", catalog = "bd_sianglv", uniqueConstraints = @UniqueConstraint(columnNames = "doc_codigo"))
public class Docentes implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -34910577504171929L;
	private Integer docId;
	private Persona persona;
	private String docCodigo;
	private Date docFechaIngreso;
	private String docProduccionIntelectual;
	private boolean docEstado;
	private Set<Experiencia> experiencias = new HashSet<Experiencia>(0);
	private Set<CargaAcademica> cargaAcademicas = new HashSet<CargaAcademica>(0);
	private Set<DirectorGrupo> directorGrupos = new HashSet<DirectorGrupo>(0);
	private Set<FormacionAcademica> formacionAcademicas = new HashSet<FormacionAcademica>(
			0);

	public Docentes() {
	}

	public Docentes(Persona persona, String docCodigo, Date docFechaIngreso,
			boolean docEstado) {
		this.persona = persona;
		this.docCodigo = docCodigo;
		this.docFechaIngreso = docFechaIngreso;
		this.docEstado = docEstado;
	}

	public Docentes(Persona persona, String docCodigo, Date docFechaIngreso,
			String docProduccionIntelectual, boolean docEstado,
			Set<Experiencia> experiencias, Set<CargaAcademica> cargaAcademicas,
			Set<DirectorGrupo> directorGrupos,
			Set<FormacionAcademica> formacionAcademicas) {
		this.persona = persona;
		this.docCodigo = docCodigo;
		this.docFechaIngreso = docFechaIngreso;
		this.docProduccionIntelectual = docProduccionIntelectual;
		this.docEstado = docEstado;
		this.experiencias = experiencias;
		this.cargaAcademicas = cargaAcademicas;
		this.directorGrupos = directorGrupos;
		this.formacionAcademicas = formacionAcademicas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "doc_id", unique = true, nullable = false)
	public Integer getDocId() {
		return this.docId;
	}

	public void setDocId(Integer docId) {
		this.docId = docId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "per_id", nullable = false)
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Column(name = "doc_codigo", unique = true, nullable = false, length = 20)
	public String getDocCodigo() {
		return this.docCodigo;
	}

	public void setDocCodigo(String docCodigo) {
		this.docCodigo = docCodigo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "doc_fecha_ingreso", nullable = false, length = 10)
	public Date getDocFechaIngreso() {
		return this.docFechaIngreso;
	}

	public void setDocFechaIngreso(Date docFechaIngreso) {
		this.docFechaIngreso = docFechaIngreso;
	}

	@Column(name = "doc_produccion_intelectual")
	public String getDocProduccionIntelectual() {
		return this.docProduccionIntelectual;
	}

	public void setDocProduccionIntelectual(String docProduccionIntelectual) {
		this.docProduccionIntelectual = docProduccionIntelectual;
	}

	@Column(name = "doc_estado", nullable = false)
	public boolean isDocEstado() {
		return this.docEstado;
	}

	public void setDocEstado(boolean docEstado) {
		this.docEstado = docEstado;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docentes")
	public Set<Experiencia> getExperiencias() {
		return this.experiencias;
	}

	public void setExperiencias(Set<Experiencia> experiencias) {
		this.experiencias = experiencias;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docentes")
	public Set<CargaAcademica> getCargaAcademicas() {
		return this.cargaAcademicas;
	}

	public void setCargaAcademicas(Set<CargaAcademica> cargaAcademicas) {
		this.cargaAcademicas = cargaAcademicas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docentes")
	public Set<DirectorGrupo> getDirectorGrupos() {
		return this.directorGrupos;
	}

	public void setDirectorGrupos(Set<DirectorGrupo> directorGrupos) {
		this.directorGrupos = directorGrupos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "docentes")
	public Set<FormacionAcademica> getFormacionAcademicas() {
		return this.formacionAcademicas;
	}

	public void setFormacionAcademicas(
			Set<FormacionAcademica> formacionAcademicas) {
		this.formacionAcademicas = formacionAcademicas;
	}

}
