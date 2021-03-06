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
 * TipoDocumento generated by hbm2java
 */
@Entity
@Table(name = "tipo_documento", catalog = "bd_sianglv", uniqueConstraints = @UniqueConstraint(columnNames = "tido_nombre"))
public class TipoDocumento implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2075571778839449803L;
	private Integer tidoId;
	private String tidoNombre;
	private Set<Documento> documentos = new HashSet<Documento>(0);

	public TipoDocumento() {
	}

	public TipoDocumento(String tidoNombre) {
		this.tidoNombre = tidoNombre;
	}

	public TipoDocumento(String tidoNombre, Set<Documento> documentos) {
		this.tidoNombre = tidoNombre;
		this.documentos = documentos;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "tido_id", unique = true, nullable = false)
	public Integer getTidoId() {
		return this.tidoId;
	}

	public void setTidoId(Integer tidoId) {
		this.tidoId = tidoId;
	}

	@Column(name = "tido_nombre", unique = true, nullable = false, length = 50)
	public String getTidoNombre() {
		return this.tidoNombre;
	}

	public void setTidoNombre(String tidoNombre) {
		this.tidoNombre = tidoNombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "tipoDocumento")
	public Set<Documento> getDocumentos() {
		return this.documentos;
	}

	public void setDocumentos(Set<Documento> documentos) {
		this.documentos = documentos;
	}

}
