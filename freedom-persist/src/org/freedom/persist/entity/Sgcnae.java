package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Sgcnae generated by hbm2java
 */
@Entity
@Table(name = "SGCNAE")
public class Sgcnae implements java.io.Serializable {

	private String codcnae;
	private String desccnae;
	private Character seccnae;
	private String divcnae;
	private String grupcnae;
	private Date dtrevcnae;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgcnae() {
	}

	public Sgcnae(String codcnae, String desccnae, Date dtins, Date hins,
			String idusuins, Date dtalt, Date halt, String idusualt) {
		this.codcnae = codcnae;
		this.desccnae = desccnae;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	public Sgcnae(String codcnae, String desccnae, Character seccnae,
			String divcnae, String grupcnae, Date dtrevcnae, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.codcnae = codcnae;
		this.desccnae = desccnae;
		this.seccnae = seccnae;
		this.divcnae = divcnae;
		this.grupcnae = grupcnae;
		this.dtrevcnae = dtrevcnae;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@Id
	@Column(name = "CODCNAE", unique = true, nullable = false, length = 15)
	public String getCodcnae() {
		return this.codcnae;
	}

	public void setCodcnae(String codcnae) {
		this.codcnae = codcnae;
	}

	@Column(name = "DESCCNAE", nullable = false, length = 100)
	public String getDesccnae() {
		return this.desccnae;
	}

	public void setDesccnae(String desccnae) {
		this.desccnae = desccnae;
	}

	@Column(name = "SECCNAE", length = 1)
	public Character getSeccnae() {
		return this.seccnae;
	}

	public void setSeccnae(Character seccnae) {
		this.seccnae = seccnae;
	}

	@Column(name = "DIVCNAE", length = 5)
	public String getDivcnae() {
		return this.divcnae;
	}

	public void setDivcnae(String divcnae) {
		this.divcnae = divcnae;
	}

	@Column(name = "GRUPCNAE", length = 5)
	public String getGrupcnae() {
		return this.grupcnae;
	}

	public void setGrupcnae(String grupcnae) {
		this.grupcnae = grupcnae;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTREVCNAE", length = 10)
	public Date getDtrevcnae() {
		return this.dtrevcnae;
	}

	public void setDtrevcnae(Date dtrevcnae) {
		this.dtrevcnae = dtrevcnae;
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
	@Column(name = "DTALT", nullable = false, length = 10)
	public Date getDtalt() {
		return this.dtalt;
	}

	public void setDtalt(Date dtalt) {
		this.dtalt = dtalt;
	}

	@Temporal(TemporalType.TIME)
	@Column(name = "HALT", nullable = false, length = 8)
	public Date getHalt() {
		return this.halt;
	}

	public void setHalt(Date halt) {
		this.halt = halt;
	}

	@Column(name = "IDUSUALT", nullable = false, length = 8)
	public String getIdusualt() {
		return this.idusualt;
	}

	public void setIdusualt(String idusualt) {
		this.idusualt = idusualt;
	}

}
