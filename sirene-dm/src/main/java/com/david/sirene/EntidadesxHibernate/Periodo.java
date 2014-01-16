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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Periodo generated by hbm2java
 */
@Entity
@Table(name = "periodo", catalog = "bd_sianglv", uniqueConstraints = {
		@UniqueConstraint(columnNames = "pe_periodo"),
		@UniqueConstraint(columnNames = { "pe_fecha_minima", "pe_fecha_maxima" }) })
public class Periodo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2158028565290184936L;
	private Integer peId;
	private String pePeriodo;
	private Date peFechaMinima;
	private Date peFechaMaxima;
	private Set<Planilla> planillas = new HashSet<Planilla>(0);

	public Periodo() {
	}

	public Periodo(String pePeriodo) {
		this.pePeriodo = pePeriodo;
	}

	public Periodo(String pePeriodo, Date peFechaMinima, Date peFechaMaxima,
			Set<Planilla> planillas) {
		this.pePeriodo = pePeriodo;
		this.peFechaMinima = peFechaMinima;
		this.peFechaMaxima = peFechaMaxima;
		this.planillas = planillas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "pe_id", unique = true, nullable = false)
	public Integer getPeId() {
		return this.peId;
	}

	public void setPeId(Integer peId) {
		this.peId = peId;
	}

	@Column(name = "pe_periodo", unique = true, nullable = false, length = 20)
	public String getPePeriodo() {
		return this.pePeriodo;
	}

	public void setPePeriodo(String pePeriodo) {
		this.pePeriodo = pePeriodo;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "pe_fecha_minima", length = 10)
	public Date getPeFechaMinima() {
		return this.peFechaMinima;
	}

	public void setPeFechaMinima(Date peFechaMinima) {
		this.peFechaMinima = peFechaMinima;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "pe_fecha_maxima", length = 10)
	public Date getPeFechaMaxima() {
		return this.peFechaMaxima;
	}

	public void setPeFechaMaxima(Date peFechaMaxima) {
		this.peFechaMaxima = peFechaMaxima;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "periodo")
	public Set<Planilla> getPlanillas() {
		return this.planillas;
	}

	public void setPlanillas(Set<Planilla> planillas) {
		this.planillas = planillas;
	}

}
