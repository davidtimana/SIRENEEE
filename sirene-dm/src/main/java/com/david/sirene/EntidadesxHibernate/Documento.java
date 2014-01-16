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
import javax.persistence.UniqueConstraint;

/**
 * Documento generated by hbm2java
 */
@Entity
@Table(name = "documento", catalog = "bd_sianglv", uniqueConstraints = @UniqueConstraint(columnNames = "do_identificacion"))
public class Documento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -55784826085757409L;
	private Integer doId;
	private TipoDocumento tipoDocumento;
	private Municipio municipio;
	private String doIdentificacion;
	private Set<Persona> personas = new HashSet<Persona>(0);

	public Documento() {
	}

	public Documento(TipoDocumento tipoDocumento, Municipio municipio,
			String doIdentificacion) {
		this.tipoDocumento = tipoDocumento;
		this.municipio = municipio;
		this.doIdentificacion = doIdentificacion;
	}

	public Documento(TipoDocumento tipoDocumento, Municipio municipio,
			String doIdentificacion, Set<Persona> personas) {
		this.tipoDocumento = tipoDocumento;
		this.municipio = municipio;
		this.doIdentificacion = doIdentificacion;
		this.personas = personas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "do_id", unique = true, nullable = false)
	public Integer getDoId() {
		return this.doId;
	}

	public void setDoId(Integer doId) {
		this.doId = doId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tido_id", nullable = false)
	public TipoDocumento getTipoDocumento() {
		return this.tipoDocumento;
	}

	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mun_id", nullable = false)
	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@Column(name = "do_identificacion", unique = true, nullable = false, length = 50)
	public String getDoIdentificacion() {
		return this.doIdentificacion;
	}

	public void setDoIdentificacion(String doIdentificacion) {
		this.doIdentificacion = doIdentificacion;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "documento")
	public Set<Persona> getPersonas() {
		return this.personas;
	}

	public void setPersonas(Set<Persona> personas) {
		this.personas = personas;
	}

}