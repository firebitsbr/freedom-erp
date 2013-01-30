package org.freedom.persist.entity;

// Generated 30/01/2013 08:30:43 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lftipofisccli generated by hbm2java
 */
@Entity
@Table(name = "LFTIPOFISCCLI")
public class Lftipofisccli implements java.io.Serializable {

	private LftipofisccliId id;
	private Eqtipomov eqtipomov;
	private String descfisccli;
	private char calccofinstf;
	private char calccsocialtf;
	private char calcicmstf;
	private char calcipitf;
	private char calcirtf;
	private char calcisstf;
	private char calcpistf;
	private char impcofinstf;
	private char impcsocialtf;
	private char impicmstf;
	private char impisstf;
	private char impipitf;
	private char impirtf;
	private char imppistf;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set<Vdcliente> vdclientes = new HashSet<Vdcliente>(0);
	private Set<Cpforneced> cpforneceds = new HashSet<Cpforneced>(0);
	private Set<Lfitclfiscal> lfitclfiscals = new HashSet<Lfitclfiscal>(0);

	public Lftipofisccli() {
	}

	public Lftipofisccli(LftipofisccliId id, String descfisccli,
			char calccofinstf, char calccsocialtf, char calcicmstf,
			char calcipitf, char calcirtf, char calcisstf, char calcpistf,
			char impcofinstf, char impcsocialtf, char impicmstf, char impisstf,
			char impipitf, char impirtf, char imppistf, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.descfisccli = descfisccli;
		this.calccofinstf = calccofinstf;
		this.calccsocialtf = calccsocialtf;
		this.calcicmstf = calcicmstf;
		this.calcipitf = calcipitf;
		this.calcirtf = calcirtf;
		this.calcisstf = calcisstf;
		this.calcpistf = calcpistf;
		this.impcofinstf = impcofinstf;
		this.impcsocialtf = impcsocialtf;
		this.impicmstf = impicmstf;
		this.impisstf = impisstf;
		this.impipitf = impipitf;
		this.impirtf = impirtf;
		this.imppistf = imppistf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lftipofisccli(LftipofisccliId id, Eqtipomov eqtipomov,
			String descfisccli, char calccofinstf, char calccsocialtf,
			char calcicmstf, char calcipitf, char calcirtf, char calcisstf,
			char calcpistf, char impcofinstf, char impcsocialtf,
			char impicmstf, char impisstf, char impipitf, char impirtf,
			char imppistf, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set<Vdcliente> vdclientes,
			Set<Cpforneced> cpforneceds, Set<Lfitclfiscal> lfitclfiscals) {
		this.id = id;
		this.eqtipomov = eqtipomov;
		this.descfisccli = descfisccli;
		this.calccofinstf = calccofinstf;
		this.calccsocialtf = calccsocialtf;
		this.calcicmstf = calcicmstf;
		this.calcipitf = calcipitf;
		this.calcirtf = calcirtf;
		this.calcisstf = calcisstf;
		this.calcpistf = calcpistf;
		this.impcofinstf = impcofinstf;
		this.impcsocialtf = impcsocialtf;
		this.impicmstf = impicmstf;
		this.impisstf = impisstf;
		this.impipitf = impipitf;
		this.impirtf = impirtf;
		this.imppistf = imppistf;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.vdclientes = vdclientes;
		this.cpforneceds = cpforneceds;
		this.lfitclfiscals = lfitclfiscals;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codfisccli", column = @Column(name = "CODFISCCLI", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public LftipofisccliId getId() {
		return this.id;
	}

	public void setId(LftipofisccliId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTIPOMOVOC", referencedColumnName = "CODTIPOMOV"),
			@JoinColumn(name = "CODFILIALOC", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPOC", referencedColumnName = "CODEMP") })
	public Eqtipomov getEqtipomov() {
		return this.eqtipomov;
	}

	public void setEqtipomov(Eqtipomov eqtipomov) {
		this.eqtipomov = eqtipomov;
	}

	@Column(name = "DESCFISCCLI", nullable = false, length = 40)
	public String getDescfisccli() {
		return this.descfisccli;
	}

	public void setDescfisccli(String descfisccli) {
		this.descfisccli = descfisccli;
	}

	@Column(name = "CALCCOFINSTF", nullable = false, length = 1)
	public char getCalccofinstf() {
		return this.calccofinstf;
	}

	public void setCalccofinstf(char calccofinstf) {
		this.calccofinstf = calccofinstf;
	}

	@Column(name = "CALCCSOCIALTF", nullable = false, length = 1)
	public char getCalccsocialtf() {
		return this.calccsocialtf;
	}

	public void setCalccsocialtf(char calccsocialtf) {
		this.calccsocialtf = calccsocialtf;
	}

	@Column(name = "CALCICMSTF", nullable = false, length = 1)
	public char getCalcicmstf() {
		return this.calcicmstf;
	}

	public void setCalcicmstf(char calcicmstf) {
		this.calcicmstf = calcicmstf;
	}

	@Column(name = "CALCIPITF", nullable = false, length = 1)
	public char getCalcipitf() {
		return this.calcipitf;
	}

	public void setCalcipitf(char calcipitf) {
		this.calcipitf = calcipitf;
	}

	@Column(name = "CALCIRTF", nullable = false, length = 1)
	public char getCalcirtf() {
		return this.calcirtf;
	}

	public void setCalcirtf(char calcirtf) {
		this.calcirtf = calcirtf;
	}

	@Column(name = "CALCISSTF", nullable = false, length = 1)
	public char getCalcisstf() {
		return this.calcisstf;
	}

	public void setCalcisstf(char calcisstf) {
		this.calcisstf = calcisstf;
	}

	@Column(name = "CALCPISTF", nullable = false, length = 1)
	public char getCalcpistf() {
		return this.calcpistf;
	}

	public void setCalcpistf(char calcpistf) {
		this.calcpistf = calcpistf;
	}

	@Column(name = "IMPCOFINSTF", nullable = false, length = 1)
	public char getImpcofinstf() {
		return this.impcofinstf;
	}

	public void setImpcofinstf(char impcofinstf) {
		this.impcofinstf = impcofinstf;
	}

	@Column(name = "IMPCSOCIALTF", nullable = false, length = 1)
	public char getImpcsocialtf() {
		return this.impcsocialtf;
	}

	public void setImpcsocialtf(char impcsocialtf) {
		this.impcsocialtf = impcsocialtf;
	}

	@Column(name = "IMPICMSTF", nullable = false, length = 1)
	public char getImpicmstf() {
		return this.impicmstf;
	}

	public void setImpicmstf(char impicmstf) {
		this.impicmstf = impicmstf;
	}

	@Column(name = "IMPISSTF", nullable = false, length = 1)
	public char getImpisstf() {
		return this.impisstf;
	}

	public void setImpisstf(char impisstf) {
		this.impisstf = impisstf;
	}

	@Column(name = "IMPIPITF", nullable = false, length = 1)
	public char getImpipitf() {
		return this.impipitf;
	}

	public void setImpipitf(char impipitf) {
		this.impipitf = impipitf;
	}

	@Column(name = "IMPIRTF", nullable = false, length = 1)
	public char getImpirtf() {
		return this.impirtf;
	}

	public void setImpirtf(char impirtf) {
		this.impirtf = impirtf;
	}

	@Column(name = "IMPPISTF", nullable = false, length = 1)
	public char getImppistf() {
		return this.imppistf;
	}

	public void setImppistf(char imppistf) {
		this.imppistf = imppistf;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTINS", nullable = false, length = 10)
	public Date getDtins() {
		return this.dtins;
	}

	public void setDtins(Date dtins) {
		this.dtins = dtins;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HINS", nullable = false, length = 8)
	public Date getHins() {
		return this.hins;
	}

	public void setHins(Date hins) {
		this.hins = hins;
	}

	@Column(name = "IDUSUINS", nullable = false, length = 8)
	public String getIdusuins() {
		return this.idusuins;
	}

	public void setIdusuins(String idusuins) {
		this.idusuins = idusuins;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTALT", length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lftipofisccli")
	public Set<Vdcliente> getVdclientes() {
		return this.vdclientes;
	}

	public void setVdclientes(Set<Vdcliente> vdclientes) {
		this.vdclientes = vdclientes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lftipofisccli")
	public Set<Cpforneced> getCpforneceds() {
		return this.cpforneceds;
	}

	public void setCpforneceds(Set<Cpforneced> cpforneceds) {
		this.cpforneceds = cpforneceds;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lftipofisccli")
	public Set<Lfitclfiscal> getLfitclfiscals() {
		return this.lfitclfiscals;
	}

	public void setLfitclfiscals(Set<Lfitclfiscal> lfitclfiscals) {
		this.lfitclfiscals = lfitclfiscals;
	}

}