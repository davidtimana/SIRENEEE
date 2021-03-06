package com.david.sirene.EntidadesxHibernate;

// Generated 15/01/2014 11:40:41 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * DirectorGrupo generated by hbm2java
 */
@Entity
@Table(name = "director_grupo", catalog = "bd_sianglv", uniqueConstraints = @UniqueConstraint(columnNames = {
		"ale_anio", "doc_id", "ubi_id" }))
public class DirectorGrupo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6219820464783225708L;
	private Integer dirId;
	private UbicacionCurso ubicacionCurso;
	private Docentes docentes;
	private AnioLectivo anioLectivo;

	public DirectorGrupo() {
	}

	public DirectorGrupo(UbicacionCurso ubicacionCurso, Docentes docentes,
			AnioLectivo anioLectivo) {
		this.ubicacionCurso = ubicacionCurso;
		this.docentes = docentes;
		this.anioLectivo = anioLectivo;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "dir_id", unique = true, nullable = false)
	public Integer getDirId() {
		return this.dirId;
	}

	public void setDirId(Integer dirId) {
		this.dirId = dirId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ubi_id", nullable = false)
	public UbicacionCurso getUbicacionCurso() {
		return this.ubicacionCurso;
	}

	public void setUbicacionCurso(UbicacionCurso ubicacionCurso) {
		this.ubicacionCurso = ubicacionCurso;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doc_id", nullable = false)
	public Docentes getDocentes() {
		return this.docentes;
	}

	public void setDocentes(Docentes docentes) {
		this.docentes = docentes;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ale_anio", nullable = false)
	public AnioLectivo getAnioLectivo() {
		return this.anioLectivo;
	}

	public void setAnioLectivo(AnioLectivo anioLectivo) {
		this.anioLectivo = anioLectivo;
	}

}
