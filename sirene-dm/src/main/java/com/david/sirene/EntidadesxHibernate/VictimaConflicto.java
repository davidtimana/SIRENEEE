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
 * VictimaConflicto generated by hbm2java
 */
@Entity
@Table(name = "victima_conflicto", catalog = "bd_sianglv", uniqueConstraints = @UniqueConstraint(columnNames = "victima_nombre"))
public class VictimaConflicto implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2606940259832864178L;
	private Integer victimaId;
	private String victimaNombre;
	private Set<Estudiantes> estudianteses = new HashSet<Estudiantes>(0);

	public VictimaConflicto() {
	}

	public VictimaConflicto(String victimaNombre) {
		this.victimaNombre = victimaNombre;
	}

	public VictimaConflicto(String victimaNombre, Set<Estudiantes> estudianteses) {
		this.victimaNombre = victimaNombre;
		this.estudianteses = estudianteses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "victima_id", unique = true, nullable = false)
	public Integer getVictimaId() {
		return this.victimaId;
	}

	public void setVictimaId(Integer victimaId) {
		this.victimaId = victimaId;
	}

	@Column(name = "victima_nombre", unique = true, nullable = false, length = 100)
	public String getVictimaNombre() {
		return this.victimaNombre;
	}

	public void setVictimaNombre(String victimaNombre) {
		this.victimaNombre = victimaNombre;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "victimaConflicto")
	public Set<Estudiantes> getEstudianteses() {
		return this.estudianteses;
	}

	public void setEstudianteses(Set<Estudiantes> estudianteses) {
		this.estudianteses = estudianteses;
	}

}
