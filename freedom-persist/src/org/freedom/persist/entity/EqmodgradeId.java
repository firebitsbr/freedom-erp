package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * EqmodgradeId generated by hbm2java
 */
@Embeddable
public class EqmodgradeId implements java.io.Serializable {

	private int codmodg;
	private short codfilial;
	private int codemp;

	public EqmodgradeId() {
	}

	public EqmodgradeId(int codmodg, short codfilial, int codemp) {
		this.codmodg = codmodg;
		this.codfilial = codfilial;
		this.codemp = codemp;
	}

	@Column(name = "CODMODG", nullable = false)
	public int getCodmodg() {
		return this.codmodg;
	}

	public void setCodmodg(int codmodg) {
		this.codmodg = codmodg;
	}

	@Column(name = "CODFILIAL", nullable = false)
	public short getCodfilial() {
		return this.codfilial;
	}

	public void setCodfilial(short codfilial) {
		this.codfilial = codfilial;
	}

	@Column(name = "CODEMP", nullable = false)
	public int getCodemp() {
		return this.codemp;
	}

	public void setCodemp(int codemp) {
		this.codemp = codemp;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof EqmodgradeId))
			return false;
		EqmodgradeId castOther = (EqmodgradeId) other;

		return (this.getCodmodg() == castOther.getCodmodg())
				&& (this.getCodfilial() == castOther.getCodfilial())
				&& (this.getCodemp() == castOther.getCodemp());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getCodmodg();
		result = 37 * result + this.getCodfilial();
		result = 37 * result + this.getCodemp();
		return result;
	}

}
