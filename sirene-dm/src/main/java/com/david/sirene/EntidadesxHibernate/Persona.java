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

/**
 * Persona generated by hbm2java
 */
@Entity
@Table(name = "persona", catalog = "bd_sianglv")
public class Persona implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3317895365660335562L;
	private Integer perId;
	private Domicilio domicilio;
	private TipoPersona tipoPersona;
	private Genero genero;
	private Documento documento;
	private Municipio municipioByMunIdEmpresa;
	private Municipio municipioByMunIdNac;
	private String perNombres;
	private String perApellidos;
	private Date perFechaNacimiento;
	private String perEmail;
	private String perProfesion;
	private String perEmpresa;
	private String perCargo;
	private String perDireccionEmpresa;
	private String perTelefonoEmpresa;
	private String perFoto;
	private Set<Docentes> docenteses = new HashSet<Docentes>(0);
	private Set<Establecimiento> establecimientosForIdSecretario = new HashSet<Establecimiento>(
			0);
	private Set<Establecimiento> establecimientosForIdRector = new HashSet<Establecimiento>(
			0);
	private Set<Acudiente> acudientes = new HashSet<Acudiente>(0);
	private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);
	private Set<Estudiantes> estudianteses = new HashSet<Estudiantes>(0);

	public Persona() {
	}

	public Persona(TipoPersona tipoPersona, String perNombres,
			String perApellidos) {
		this.tipoPersona = tipoPersona;
		this.perNombres = perNombres;
		this.perApellidos = perApellidos;
	}

	public Persona(Domicilio domicilio, TipoPersona tipoPersona, Genero genero,
			Documento documento, Municipio municipioByMunIdEmpresa,
			Municipio municipioByMunIdNac, String perNombres,
			String perApellidos, Date perFechaNacimiento, String perEmail,
			String perProfesion, String perEmpresa, String perCargo,
			String perDireccionEmpresa, String perTelefonoEmpresa,
			String perFoto, Set<Docentes> docenteses,
			Set<Establecimiento> establecimientosForIdSecretario,
			Set<Establecimiento> establecimientosForIdRector,
			Set<Acudiente> acudientes, Set<Usuarios> usuarioses,
			Set<Estudiantes> estudianteses) {
		this.domicilio = domicilio;
		this.tipoPersona = tipoPersona;
		this.genero = genero;
		this.documento = documento;
		this.municipioByMunIdEmpresa = municipioByMunIdEmpresa;
		this.municipioByMunIdNac = municipioByMunIdNac;
		this.perNombres = perNombres;
		this.perApellidos = perApellidos;
		this.perFechaNacimiento = perFechaNacimiento;
		this.perEmail = perEmail;
		this.perProfesion = perProfesion;
		this.perEmpresa = perEmpresa;
		this.perCargo = perCargo;
		this.perDireccionEmpresa = perDireccionEmpresa;
		this.perTelefonoEmpresa = perTelefonoEmpresa;
		this.perFoto = perFoto;
		this.docenteses = docenteses;
		this.establecimientosForIdSecretario = establecimientosForIdSecretario;
		this.establecimientosForIdRector = establecimientosForIdRector;
		this.acudientes = acudientes;
		this.usuarioses = usuarioses;
		this.estudianteses = estudianteses;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "per_id", unique = true, nullable = false)
	public Integer getPerId() {
		return this.perId;
	}

	public void setPerId(Integer perId) {
		this.perId = perId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dom_id")
	public Domicilio getDomicilio() {
		return this.domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tipo_id", nullable = false)
	public TipoPersona getTipoPersona() {
		return this.tipoPersona;
	}

	public void setTipoPersona(TipoPersona tipoPersona) {
		this.tipoPersona = tipoPersona;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "genero_id")
	public Genero getGenero() {
		return this.genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "do_id")
	public Documento getDocumento() {
		return this.documento;
	}

	public void setDocumento(Documento documento) {
		this.documento = documento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mun_id_empresa")
	public Municipio getMunicipioByMunIdEmpresa() {
		return this.municipioByMunIdEmpresa;
	}

	public void setMunicipioByMunIdEmpresa(Municipio municipioByMunIdEmpresa) {
		this.municipioByMunIdEmpresa = municipioByMunIdEmpresa;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mun_id_nac")
	public Municipio getMunicipioByMunIdNac() {
		return this.municipioByMunIdNac;
	}

	public void setMunicipioByMunIdNac(Municipio municipioByMunIdNac) {
		this.municipioByMunIdNac = municipioByMunIdNac;
	}

	@Column(name = "per_nombres", nullable = false, length = 50)
	public String getPerNombres() {
		return this.perNombres;
	}

	public void setPerNombres(String perNombres) {
		this.perNombres = perNombres;
	}

	@Column(name = "per_apellidos", nullable = false, length = 50)
	public String getPerApellidos() {
		return this.perApellidos;
	}

	public void setPerApellidos(String perApellidos) {
		this.perApellidos = perApellidos;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "per_fecha_nacimiento", length = 10)
	public Date getPerFechaNacimiento() {
		return this.perFechaNacimiento;
	}

	public void setPerFechaNacimiento(Date perFechaNacimiento) {
		this.perFechaNacimiento = perFechaNacimiento;
	}

	@Column(name = "per_email", length = 50)
	public String getPerEmail() {
		return this.perEmail;
	}

	public void setPerEmail(String perEmail) {
		this.perEmail = perEmail;
	}

	@Column(name = "per_profesion", length = 100)
	public String getPerProfesion() {
		return this.perProfesion;
	}

	public void setPerProfesion(String perProfesion) {
		this.perProfesion = perProfesion;
	}

	@Column(name = "per_empresa", length = 100)
	public String getPerEmpresa() {
		return this.perEmpresa;
	}

	public void setPerEmpresa(String perEmpresa) {
		this.perEmpresa = perEmpresa;
	}

	@Column(name = "per_cargo", length = 100)
	public String getPerCargo() {
		return this.perCargo;
	}

	public void setPerCargo(String perCargo) {
		this.perCargo = perCargo;
	}

	@Column(name = "per_direccion_empresa", length = 100)
	public String getPerDireccionEmpresa() {
		return this.perDireccionEmpresa;
	}

	public void setPerDireccionEmpresa(String perDireccionEmpresa) {
		this.perDireccionEmpresa = perDireccionEmpresa;
	}

	@Column(name = "per_telefono_empresa", length = 100)
	public String getPerTelefonoEmpresa() {
		return this.perTelefonoEmpresa;
	}

	public void setPerTelefonoEmpresa(String perTelefonoEmpresa) {
		this.perTelefonoEmpresa = perTelefonoEmpresa;
	}

	@Column(name = "per_foto", length = 200)
	public String getPerFoto() {
		return this.perFoto;
	}

	public void setPerFoto(String perFoto) {
		this.perFoto = perFoto;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<Docentes> getDocenteses() {
		return this.docenteses;
	}

	public void setDocenteses(Set<Docentes> docenteses) {
		this.docenteses = docenteses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personaByIdSecretario")
	public Set<Establecimiento> getEstablecimientosForIdSecretario() {
		return this.establecimientosForIdSecretario;
	}

	public void setEstablecimientosForIdSecretario(
			Set<Establecimiento> establecimientosForIdSecretario) {
		this.establecimientosForIdSecretario = establecimientosForIdSecretario;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "personaByIdRector")
	public Set<Establecimiento> getEstablecimientosForIdRector() {
		return this.establecimientosForIdRector;
	}

	public void setEstablecimientosForIdRector(
			Set<Establecimiento> establecimientosForIdRector) {
		this.establecimientosForIdRector = establecimientosForIdRector;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<Acudiente> getAcudientes() {
		return this.acudientes;
	}

	public void setAcudientes(Set<Acudiente> acudientes) {
		this.acudientes = acudientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<Usuarios> getUsuarioses() {
		return this.usuarioses;
	}

	public void setUsuarioses(Set<Usuarios> usuarioses) {
		this.usuarioses = usuarioses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persona")
	public Set<Estudiantes> getEstudianteses() {
		return this.estudianteses;
	}

	public void setEstudianteses(Set<Estudiantes> estudianteses) {
		this.estudianteses = estudianteses;
	}

}
