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
 * Estudiantes generated by hbm2java
 */
@Entity
@Table(name = "estudiantes", catalog = "bd_sianglv", uniqueConstraints = @UniqueConstraint(columnNames = "est_codigo"))
public class Estudiantes implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4283497044497798541L;
	private Integer estId;
	private Municipio municipio;
	private Zona zona;
	private Resguardo resguardo;
	private Capacidades capacidades;
	private Persona persona;
	private Estrato estrato;
	private Sisben sisben;
	private Discapacidades discapacidades;
	private TipoSangre tipoSangre;
	private Etnias etnias;
	private Estados estados;
	private VictimaConflicto victimaConflicto;
	private String estCodigo;
	private String estLocalidadComuna;
	private String estBarrio;
	private Boolean estSectorPrivado;
	private Boolean estOtroMunicipio;
	private String estBienestarOrigen;
	private String estArs;
	private String estEps;
	private String estTiempoSinestudiar;
	private int estUltimoGrado;
	private String estEstablecimientoAnterior;
	private Set<Acudiente> acudientes = new HashSet<Acudiente>(0);

	public Estudiantes() {
	}

	public Estudiantes(Municipio municipio, Persona persona, Estados estados,
			String estCodigo, String estTiempoSinestudiar, int estUltimoGrado,
			String estEstablecimientoAnterior) {
		this.municipio = municipio;
		this.persona = persona;
		this.estados = estados;
		this.estCodigo = estCodigo;
		this.estTiempoSinestudiar = estTiempoSinestudiar;
		this.estUltimoGrado = estUltimoGrado;
		this.estEstablecimientoAnterior = estEstablecimientoAnterior;
	}

	public Estudiantes(Municipio municipio, Zona zona, Resguardo resguardo,
			Capacidades capacidades, Persona persona, Estrato estrato,
			Sisben sisben, Discapacidades discapacidades,
			TipoSangre tipoSangre, Etnias etnias, Estados estados,
			VictimaConflicto victimaConflicto, String estCodigo,
			String estLocalidadComuna, String estBarrio,
			Boolean estSectorPrivado, Boolean estOtroMunicipio,
			String estBienestarOrigen, String estArs, String estEps,
			String estTiempoSinestudiar, int estUltimoGrado,
			String estEstablecimientoAnterior, Set<Acudiente> acudientes) {
		this.municipio = municipio;
		this.zona = zona;
		this.resguardo = resguardo;
		this.capacidades = capacidades;
		this.persona = persona;
		this.estrato = estrato;
		this.sisben = sisben;
		this.discapacidades = discapacidades;
		this.tipoSangre = tipoSangre;
		this.etnias = etnias;
		this.estados = estados;
		this.victimaConflicto = victimaConflicto;
		this.estCodigo = estCodigo;
		this.estLocalidadComuna = estLocalidadComuna;
		this.estBarrio = estBarrio;
		this.estSectorPrivado = estSectorPrivado;
		this.estOtroMunicipio = estOtroMunicipio;
		this.estBienestarOrigen = estBienestarOrigen;
		this.estArs = estArs;
		this.estEps = estEps;
		this.estTiempoSinestudiar = estTiempoSinestudiar;
		this.estUltimoGrado = estUltimoGrado;
		this.estEstablecimientoAnterior = estEstablecimientoAnterior;
		this.acudientes = acudientes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "est_id", unique = true, nullable = false)
	public Integer getEstId() {
		return this.estId;
	}

	public void setEstId(Integer estId) {
		this.estId = estId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "mun_id_expul", nullable = false)
	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "zona_id")
	public Zona getZona() {
		return this.zona;
	}

	public void setZona(Zona zona) {
		this.zona = zona;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "resguardo_id")
	public Resguardo getResguardo() {
		return this.resguardo;
	}

	public void setResguardo(Resguardo resguardo) {
		this.resguardo = resguardo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cap_id")
	public Capacidades getCapacidades() {
		return this.capacidades;
	}

	public void setCapacidades(Capacidades capacidades) {
		this.capacidades = capacidades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "per_id", nullable = false)
	public Persona getPersona() {
		return this.persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estrato_id")
	public Estrato getEstrato() {
		return this.estrato;
	}

	public void setEstrato(Estrato estrato) {
		this.estrato = estrato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "sisben_id")
	public Sisben getSisben() {
		return this.sisben;
	}

	public void setSisben(Sisben sisben) {
		this.sisben = sisben;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "disc_id")
	public Discapacidades getDiscapacidades() {
		return this.discapacidades;
	}

	public void setDiscapacidades(Discapacidades discapacidades) {
		this.discapacidades = discapacidades;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "tsangre_id")
	public TipoSangre getTipoSangre() {
		return this.tipoSangre;
	}

	public void setTipoSangre(TipoSangre tipoSangre) {
		this.tipoSangre = tipoSangre;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "etnia_id")
	public Etnias getEtnias() {
		return this.etnias;
	}

	public void setEtnias(Etnias etnias) {
		this.etnias = etnias;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "estado_id", nullable = false)
	public Estados getEstados() {
		return this.estados;
	}

	public void setEstados(Estados estados) {
		this.estados = estados;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "victima_id")
	public VictimaConflicto getVictimaConflicto() {
		return this.victimaConflicto;
	}

	public void setVictimaConflicto(VictimaConflicto victimaConflicto) {
		this.victimaConflicto = victimaConflicto;
	}

	@Column(name = "est_codigo", unique = true, nullable = false, length = 20)
	public String getEstCodigo() {
		return this.estCodigo;
	}

	public void setEstCodigo(String estCodigo) {
		this.estCodigo = estCodigo;
	}

	@Column(name = "est_localidad_comuna", length = 100)
	public String getEstLocalidadComuna() {
		return this.estLocalidadComuna;
	}

	public void setEstLocalidadComuna(String estLocalidadComuna) {
		this.estLocalidadComuna = estLocalidadComuna;
	}

	@Column(name = "est_barrio", length = 50)
	public String getEstBarrio() {
		return this.estBarrio;
	}

	public void setEstBarrio(String estBarrio) {
		this.estBarrio = estBarrio;
	}

	@Column(name = "est_sector_privado")
	public Boolean getEstSectorPrivado() {
		return this.estSectorPrivado;
	}

	public void setEstSectorPrivado(Boolean estSectorPrivado) {
		this.estSectorPrivado = estSectorPrivado;
	}

	@Column(name = "est_otro_municipio")
	public Boolean getEstOtroMunicipio() {
		return this.estOtroMunicipio;
	}

	public void setEstOtroMunicipio(Boolean estOtroMunicipio) {
		this.estOtroMunicipio = estOtroMunicipio;
	}

	@Column(name = "est_bienestar_origen", length = 20)
	public String getEstBienestarOrigen() {
		return this.estBienestarOrigen;
	}

	public void setEstBienestarOrigen(String estBienestarOrigen) {
		this.estBienestarOrigen = estBienestarOrigen;
	}

	@Column(name = "est_ARS", length = 20)
	public String getEstArs() {
		return this.estArs;
	}

	public void setEstArs(String estArs) {
		this.estArs = estArs;
	}

	@Column(name = "est_EPS", length = 20)
	public String getEstEps() {
		return this.estEps;
	}

	public void setEstEps(String estEps) {
		this.estEps = estEps;
	}

	@Column(name = "est_tiempo_sinestudiar", nullable = false, length = 50)
	public String getEstTiempoSinestudiar() {
		return this.estTiempoSinestudiar;
	}

	public void setEstTiempoSinestudiar(String estTiempoSinestudiar) {
		this.estTiempoSinestudiar = estTiempoSinestudiar;
	}

	@Column(name = "est_ultimo_grado", nullable = false)
	public int getEstUltimoGrado() {
		return this.estUltimoGrado;
	}

	public void setEstUltimoGrado(int estUltimoGrado) {
		this.estUltimoGrado = estUltimoGrado;
	}

	@Column(name = "est_establecimiento_anterior", nullable = false, length = 200)
	public String getEstEstablecimientoAnterior() {
		return this.estEstablecimientoAnterior;
	}

	public void setEstEstablecimientoAnterior(String estEstablecimientoAnterior) {
		this.estEstablecimientoAnterior = estEstablecimientoAnterior;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "estudiantes")
	public Set<Acudiente> getAcudientes() {
		return this.acudientes;
	}

	public void setAcudientes(Set<Acudiente> acudientes) {
		this.acudientes = acudientes;
	}

}
