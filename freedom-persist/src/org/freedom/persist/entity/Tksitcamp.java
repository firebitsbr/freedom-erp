package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

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
 * Tksitcamp generated by hbm2java
 */
@Entity
@Table(name = "TKSITCAMP")
public class Tksitcamp implements java.io.Serializable {

	private TksitcampId id;
	private Tkcontato tkcontato;
	private Vdcliente vdcliente;
	private Tkcampanha tkcampanha;
	private int codempav;
	private short codfilialav;
	private int codativ;
	private Date dtsitcamp;
	private Date hrsitcamp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set tkhistoricos = new HashSet(0);

	public Tksitcamp() {
	}

	public Tksitcamp(TksitcampId id, Tkcampanha tkcampanha, int codempav,
			short codfilialav, int codativ, Date dtsitcamp, Date hrsitcamp,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.tkcampanha = tkcampanha;
		this.codempav = codempav;
		this.codfilialav = codfilialav;
		this.codativ = codativ;
		this.dtsitcamp = dtsitcamp;
		this.hrsitcamp = hrsitcamp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Tksitcamp(TksitcampId id, Tkcontato tkcontato, Vdcliente vdcliente,
			Tkcampanha tkcampanha, int codempav, short codfilialav,
			int codativ, Date dtsitcamp, Date hrsitcamp, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set tkhistoricos) {
		this.id = id;
		this.tkcontato = tkcontato;
		this.vdcliente = vdcliente;
		this.tkcampanha = tkcampanha;
		this.codempav = codempav;
		this.codfilialav = codfilialav;
		this.codativ = codativ;
		this.dtsitcamp = dtsitcamp;
		this.hrsitcamp = hrsitcamp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.tkhistoricos = tkhistoricos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codcamp", column = @Column(name = "CODCAMP", nullable = false, length = 13)),
			@AttributeOverride(name = "seqsitcamp", column = @Column(name = "SEQSITCAMP", nullable = false)),
			@AttributeOverride(name = "tipocto", column = @Column(name = "TIPOCTO", nullable = false, length = 1)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public TksitcampId getId() {
		return this.id;
	}

	public void setId(TksitcampId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCTO", referencedColumnName = "CODCTO"),
			@JoinColumn(name = "CODFILIALCO", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCO", referencedColumnName = "CODEMP") })
	public Tkcontato getTkcontato() {
		return this.tkcontato;
	}

	public void setTkcontato(Tkcontato tkcontato) {
		this.tkcontato = tkcontato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI"),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP") })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCAMP", referencedColumnName = "CODCAMP", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Tkcampanha getTkcampanha() {
		return this.tkcampanha;
	}

	public void setTkcampanha(Tkcampanha tkcampanha) {
		this.tkcampanha = tkcampanha;
	}

	@Column(name = "CODEMPAV", nullable = false)
	public int getCodempav() {
		return this.codempav;
	}

	public void setCodempav(int codempav) {
		this.codempav = codempav;
	}

	@Column(name = "CODFILIALAV", nullable = false)
	public short getCodfilialav() {
		return this.codfilialav;
	}

	public void setCodfilialav(short codfilialav) {
		this.codfilialav = codfilialav;
	}

	@Column(name = "CODATIV", nullable = false)
	public int getCodativ() {
		return this.codativ;
	}

	public void setCodativ(int codativ) {
		this.codativ = codativ;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTSITCAMP", nullable = false, length = 10)
	public Date getDtsitcamp() {
		return this.dtsitcamp;
	}

	public void setDtsitcamp(Date dtsitcamp) {
		this.dtsitcamp = dtsitcamp;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HRSITCAMP", nullable = false, length = 8)
	public Date getHrsitcamp() {
		return this.hrsitcamp;
	}

	public void setHrsitcamp(Date hrsitcamp) {
		this.hrsitcamp = hrsitcamp;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "tksitcamp")
	public Set getTkhistoricos() {
		return this.tkhistoricos;
	}

	public void setTkhistoricos(Set tkhistoricos) {
		this.tkhistoricos = tkhistoricos;
	}
*/
}
