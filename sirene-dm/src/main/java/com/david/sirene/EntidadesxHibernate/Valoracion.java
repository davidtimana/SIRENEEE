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
 * Valoracion generated by hbm2java
 */
@Entity
@Table(name = "valoracion", catalog = "bd_sianglv", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "val_minimo", "val_maximo" }),
		@UniqueConstraint(columnNames = "val_maximo"),
		@UniqueConstraint(columnNames = "val_minimo"),
		@UniqueConstraint(columnNames = "val_desempenio") })
public class Valoracion implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4562651969808874110L;
	private Integer valId;
	private String valDesempenio;
	private float valMinimo;
	private float valMaximo;
	private Set<Indicadores> indicadoreses = new HashSet<Indicadores>(0);

	public Valoracion() {
	}

	public Valoracion(String valDesempenio, float valMinimo, float valMaximo) {
		this.valDesempenio = valDesempenio;
		this.valMinimo = valMinimo;
		this.valMaximo = valMaximo;
	}

	public Valoracion(String valDesempenio, float valMinimo, float valMaximo,
			Set<Indicadores> indicadoreses) {
		this.valDesempenio = valDesempenio;
		this.valMinimo = valMinimo;
		this.valMaximo = valMaximo;
		this.indicadoreses = indicadoreses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "val_id", unique = true, nullable = false)
	public Integer getValId() {
		return this.valId;
	}

	public void setValId(Integer valId) {
		this.valId = valId;
	}

	@Column(name = "val_desempenio", unique = true, nullable = false, length = 20)
	public String getValDesempenio() {
		return this.valDesempenio;
	}

	public void setValDesempenio(String valDesempenio) {
		this.valDesempenio = valDesempenio;
	}

	@Column(name = "val_minimo", unique = true, nullable = false, precision = 12, scale = 0)
	public float getValMinimo() {
		return this.valMinimo;
	}

	public void setValMinimo(float valMinimo) {
		this.valMinimo = valMinimo;
	}

	@Column(name = "val_maximo", unique = true, nullable = false, precision = 12, scale = 0)
	public float getValMaximo() {
		return this.valMaximo;
	}

	public void setValMaximo(float valMaximo) {
		this.valMaximo = valMaximo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "valoracion")
	public Set<Indicadores> getIndicadoreses() {
		return this.indicadoreses;
	}

	public void setIndicadoreses(Set<Indicadores> indicadoreses) {
		this.indicadoreses = indicadoreses;
	}

}
