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
 * Sgsistema generated by hbm2java
 */
@Entity
@Table(name = "SGSISTEMA")
public class Sgsistema implements java.io.Serializable {

	private int codsis;
	private String descsis;
	private String comentsis;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;

	public Sgsistema() {
	}

	public Sgsistema(int codsis, String descsis, Date dtins, Date hins,
			String idusuins) {
		this.codsis = codsis;
		this.descsis = descsis;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Sgsistema(int codsis, String descsis, String comentsis, Date dtins,
			Date hins, String idusuins, Date dtalt, Date halt, String idusualt) {
		this.codsis = codsis;
		this.descsis = descsis;
		this.comentsis = comentsis;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
	}

	@Id
	@Column(name = "CODSIS", unique = true, nullable = false)
	public int getCodsis() {
		return this.codsis;
	}

	public void setCodsis(int codsis) {
		this.codsis = codsis;
	}

	@Column(name = "DESCSIS", nullable = false, length = 50)
	public String getDescsis() {
		return this.descsis;
	}

	public void setDescsis(String descsis) {
		this.descsis = descsis;
	}

	@Column(name = "COMENTSIS", length = 10000)
	public String getComentsis() {
		return this.comentsis;
	}

	public void setComentsis(String comentsis) {
		this.comentsis = comentsis;
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
