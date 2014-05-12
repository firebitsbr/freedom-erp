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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgfluxo generated by hbm2java
 */
@Entity
@Table(name = "SGFLUXO")
public class Sgfluxo implements java.io.Serializable {

	private SgfluxoId id;
	private String descfluxo;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set sgitfluxos = new HashSet(0);
	private Set attipoatendos = new HashSet(0);

	public Sgfluxo() {
	}

	public Sgfluxo(SgfluxoId id, String descfluxo, Date dtins, Date hins,
			String idusuins) {
		this.id = id;
		this.descfluxo = descfluxo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgfluxo(SgfluxoId id, String descfluxo, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt,
			Set sgitfluxos, Set attipoatendos) {
		this.id = id;
		this.descfluxo = descfluxo;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.sgitfluxos = sgitfluxos;
		this.attipoatendos = attipoatendos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codfluxo", column = @Column(name = "CODFLUXO", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public SgfluxoId getId() {
		return this.id;
	}

	public void setId(SgfluxoId id) {
		this.id = id;
	}

	@Column(name = "DESCFLUXO", nullable = false, length = 50)
	public String getDescfluxo() {
		return this.descfluxo;
	}

	public void setDescfluxo(String descfluxo) {
		this.descfluxo = descfluxo;
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

/*	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgfluxo")
	public Set getSgitfluxos() {
		return this.sgitfluxos;
	}

	public void setSgitfluxos(Set sgitfluxos) {
		this.sgitfluxos = sgitfluxos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "sgfluxo")
	public Set getAttipoatendos() {
		return this.attipoatendos;
	}

	public void setAttipoatendos(Set attipoatendos) {
		this.attipoatendos = attipoatendos;
	}
*/
}
