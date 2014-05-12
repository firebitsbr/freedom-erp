package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Eqprodplan generated by hbm2java
 */
@Entity
@Table(name = "EQPRODPLAN")
public class Eqprodplan implements java.io.Serializable {

	private EqprodplanId id;
	private Eqproduto eqproduto;
	private Fnplanejamento fnplanejamento;
	private Fncc fncc;
	private char tipopp;
	private BigDecimal percpp;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Eqprodplan() {
	}

	public Eqprodplan(EqprodplanId id, Eqproduto eqproduto,
			Fnplanejamento fnplanejamento, Fncc fncc, char tipopp,
			BigDecimal percpp, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.fnplanejamento = fnplanejamento;
		this.fncc = fncc;
		this.tipopp = tipopp;
		this.percpp = percpp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Eqprodplan(EqprodplanId id, Eqproduto eqproduto,
			Fnplanejamento fnplanejamento, Fncc fncc, char tipopp,
			BigDecimal percpp, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt) {
		this.id = id;
		this.eqproduto = eqproduto;
		this.fnplanejamento = fnplanejamento;
		this.fncc = fncc;
		this.tipopp = tipopp;
		this.percpp = percpp;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codprod", column = @Column(name = "CODPROD", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)),
			@AttributeOverride(name = "seqpp", column = @Column(name = "SEQPP", nullable = false)) })
	public EqprodplanId getId() {
		return this.id;
	}

	public void setId(EqprodplanId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPROD", referencedColumnName = "CODPROD", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODFILIAL", referencedColumnName = "CODFILIAL", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CODEMP", referencedColumnName = "CODEMP", nullable = false, insertable = false, updatable = false) })
	public Eqproduto getEqproduto() {
		return this.eqproduto;
	}

	public void setEqproduto(Eqproduto eqproduto) {
		this.eqproduto = eqproduto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODPLAN", referencedColumnName = "CODPLAN", nullable = false),
			@JoinColumn(name = "CODFILIALPN", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPPN", referencedColumnName = "CODEMP", nullable = false) })
	public Fnplanejamento getFnplanejamento() {
		return this.fnplanejamento;
	}

	public void setFnplanejamento(Fnplanejamento fnplanejamento) {
		this.fnplanejamento = fnplanejamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCC", referencedColumnName = "CODCC", nullable = false),
			@JoinColumn(name = "ANOCC", referencedColumnName = "ANOCC", nullable = false),
			@JoinColumn(name = "CODFILIALCC", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPCC", referencedColumnName = "CODEMP", nullable = false) })
	public Fncc getFncc() {
		return this.fncc;
	}

	public void setFncc(Fncc fncc) {
		this.fncc = fncc;
	}

	@Column(name = "TIPOPP", nullable = false, length = 1)
	public char getTipopp() {
		return this.tipopp;
	}

	public void setTipopp(char tipopp) {
		this.tipopp = tipopp;
	}

	@Column(name = "PERCPP", nullable = false, precision = 6)
	public BigDecimal getPercpp() {
		return this.percpp;
	}

	public void setPercpp(BigDecimal percpp) {
		this.percpp = percpp;
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

}
