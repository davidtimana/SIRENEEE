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

/**
 * Observaciones generated by hbm2java
 */
@Entity
@Table(name = "observaciones", catalog = "bd_sianglv")
public class Observaciones implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -468511102750769984L;
	private Integer obId;
	private Planilla planilla;
	private String obObservacion;

	public Observaciones() {
	}

	public Observaciones(Planilla planilla) {
		this.planilla = planilla;
	}

	public Observaciones(Planilla planilla, String obObservacion) {
		this.planilla = planilla;
		this.obObservacion = obObservacion;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ob_id", unique = true, nullable = false)
	public Integer getObId() {
		return this.obId;
	}

	public void setObId(Integer obId) {
		this.obId = obId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "pla_id", nullable = false)
	public Planilla getPlanilla() {
		return this.planilla;
	}

	public void setPlanilla(Planilla planilla) {
		this.planilla = planilla;
	}

	@Column(name = "ob_observacion")
	public String getObObservacion() {
		return this.obObservacion;
	}

	public void setObObservacion(String obObservacion) {
		this.obObservacion = obObservacion;
	}

}
