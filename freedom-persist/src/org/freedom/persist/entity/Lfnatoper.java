package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Lfnatoper generated by hbm2java
 */
@Entity
@Table(name = "LFNATOPER")
public class Lfnatoper implements java.io.Serializable {

	private LfnatoperId id;
	private Sgfilial sgfilial;
	private String descnat;
	private char impdtsaidanat;
	private BigDecimal aliqenat;
	private BigDecimal aliqfnat;
	private String txtnat;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set lfitregrafiscals = new HashSet(0);
	private Set lffretes = new HashSet(0);
	private Set cpequivcfopsForCpequivcfopfklfnan = new HashSet(0);
	private Set cpitcompras = new HashSet(0);
	private Set vditvendas = new HashSet(0);
	private Set lflivrofiscals = new HashSet(0);
	private Cpequivcfop cpequivcfopByCpequivcfopfklfnat;

	public Lfnatoper() {
	}

	public Lfnatoper(LfnatoperId id, Sgfilial sgfilial, String descnat,
			char impdtsaidanat, BigDecimal aliqenat, BigDecimal aliqfnat,
			Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descnat = descnat;
		this.impdtsaidanat = impdtsaidanat;
		this.aliqenat = aliqenat;
		this.aliqfnat = aliqfnat;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Lfnatoper(LfnatoperId id, Sgfilial sgfilial, String descnat,
			char impdtsaidanat, BigDecimal aliqenat, BigDecimal aliqfnat,
			String txtnat, Date dtins, Date hins, String idusuins, Date dtalt,
			Date halt, String idusualt, Set lfitregrafiscals, Set lffretes,
			Set cpequivcfopsForCpequivcfopfklfnan, Set cpitcompras,
			Set vditvendas, Set lflivrofiscals,
			Cpequivcfop cpequivcfopByCpequivcfopfklfnat) {
		this.id = id;
		this.sgfilial = sgfilial;
		this.descnat = descnat;
		this.impdtsaidanat = impdtsaidanat;
		this.aliqenat = aliqenat;
		this.aliqfnat = aliqfnat;
		this.txtnat = txtnat;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.lfitregrafiscals = lfitregrafiscals;
		this.lffretes = lffretes;
		this.cpequivcfopsForCpequivcfopfklfnan = cpequivcfopsForCpequivcfopfklfnan;
		this.cpitcompras = cpitcompras;
		this.vditvendas = vditvendas;
		this.lflivrofiscals = lflivrofiscals;
		this.cpequivcfopByCpequivcfopfklfnat = cpequivcfopByCpequivcfopfklfnat;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codnat", column = @Column(name = "CODNAT", nullable = false, length = 4)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public LfnatoperId getId() {
		return this.id;
	}

	public void setId(LfnatoperId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Sgfilial getSgfilial() {
		return this.sgfilial;
	}

	public void setSgfilial(Sgfilial sgfilial) {
		this.sgfilial = sgfilial;
	}

	@Column(name = "DESCNAT", nullable = false, length = 60)
	public String getDescnat() {
		return this.descnat;
	}

	public void setDescnat(String descnat) {
		this.descnat = descnat;
	}

	@Column(name = "IMPDTSAIDANAT", nullable = false, length = 1)
	public char getImpdtsaidanat() {
		return this.impdtsaidanat;
	}

	public void setImpdtsaidanat(char impdtsaidanat) {
		this.impdtsaidanat = impdtsaidanat;
	}

	@Column(name = "ALIQENAT", nullable = false, precision = 6)
	public BigDecimal getAliqenat() {
		return this.aliqenat;
	}

	public void setAliqenat(BigDecimal aliqenat) {
		this.aliqenat = aliqenat;
	}

	@Column(name = "ALIQFNAT", nullable = false, precision = 6)
	public BigDecimal getAliqfnat() {
		return this.aliqfnat;
	}

	public void setAliqfnat(BigDecimal aliqfnat) {
		this.aliqfnat = aliqfnat;
	}

	@Column(name = "TXTNAT", length = 500)
	public String getTxtnat() {
		return this.txtnat;
	}

	public void setTxtnat(String txtnat) {
		this.txtnat = txtnat;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfnatoper")
	public Set getLfitregrafiscals() {
		return this.lfitregrafiscals;
	}

	public void setLfitregrafiscals(Set lfitregrafiscals) {
		this.lfitregrafiscals = lfitregrafiscals;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfnatoper")
	public Set getLffretes() {
		return this.lffretes;
	}

	public void setLffretes(Set lffretes) {
		this.lffretes = lffretes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfnatoperByCpequivcfopfklfnan")
	public Set getCpequivcfopsForCpequivcfopfklfnan() {
		return this.cpequivcfopsForCpequivcfopfklfnan;
	}

	public void setCpequivcfopsForCpequivcfopfklfnan(
			Set cpequivcfopsForCpequivcfopfklfnan) {
		this.cpequivcfopsForCpequivcfopfklfnan = cpequivcfopsForCpequivcfopfklfnan;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfnatoper")
	public Set getCpitcompras() {
		return this.cpitcompras;
	}

	public void setCpitcompras(Set cpitcompras) {
		this.cpitcompras = cpitcompras;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfnatoper")
	public Set getVditvendas() {
		return this.vditvendas;
	}

	public void setVditvendas(Set vditvendas) {
		this.vditvendas = vditvendas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lfnatoper")
	public Set getLflivrofiscals() {
		return this.lflivrofiscals;
	}

	public void setLflivrofiscals(Set lflivrofiscals) {
		this.lflivrofiscals = lflivrofiscals;
	}

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "lfnatoperByCpequivcfopfklfnat")
	public Cpequivcfop getCpequivcfopByCpequivcfopfklfnat() {
		return this.cpequivcfopByCpequivcfopfklfnat;
	}

	public void setCpequivcfopByCpequivcfopfklfnat(
			Cpequivcfop cpequivcfopByCpequivcfopfklfnat) {
		this.cpequivcfopByCpequivcfopfklfnat = cpequivcfopByCpequivcfopfklfnat;
	}
*/
}
