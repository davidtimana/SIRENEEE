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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CargaAcademica generated by hbm2java
 */
@Entity
@Table(name = "carga_academica", catalog = "bd_sianglv")
public class CargaAcademica implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1960329417632946013L;
	private Integer carId;
	private GradoMateria gradoMateria;
	private AnioLectivo anioLectivo;
	private UbicacionCurso ubicacionCurso;
	private Docentes docentes;
	private Set<Planilla> planillas = new HashSet<Planilla>(0);

	public CargaAcademica() {
	}

	public CargaAcademica(GradoMateria gradoMateria, AnioLectivo anioLectivo,
			UbicacionCurso ubicacionCurso, Docentes docentes) {
		this.gradoMateria = gradoMateria;
		this.anioLectivo = anioLectivo;
		this.ubicacionCurso = ubicacionCurso;
		this.docentes = docentes;
	}

	public CargaAcademica(GradoMateria gradoMateria, AnioLectivo anioLectivo,
			UbicacionCurso ubicacionCurso, Docentes docentes,
			Set<Planilla> planillas) {
		this.gradoMateria = gradoMateria;
		this.anioLectivo = anioLectivo;
		this.ubicacionCurso = ubicacionCurso;
		this.docentes = docentes;
		this.planillas = planillas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "car_id", unique = true, nullable = false)
	public Integer getCarId() {
		return this.carId;
	}

	public void setCarId(Integer carId) {
		this.carId = carId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gram_id", nullable = false)
	public GradoMateria getGradoMateria() {
		return this.gradoMateria;
	}

	public void setGradoMateria(GradoMateria gradoMateria) {
		this.gradoMateria = gradoMateria;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ale_id", nullable = false)
	public AnioLectivo getAnioLectivo() {
		return this.anioLectivo;
	}

	public void setAnioLectivo(AnioLectivo anioLectivo) {
		this.anioLectivo = anioLectivo;
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

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cargaAcademica")
	public Set<Planilla> getPlanillas() {
		return this.planillas;
	}

	public void setPlanillas(Set<Planilla> planillas) {
		this.planillas = planillas;
	}

}
