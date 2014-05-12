package org.freedom.persist.entity;

// Generated 12/05/2014 09:11:34 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Vwcustoproj01 generated by hbm2java
 */
@Entity
@Table(name = "VWCUSTOPROJ01")
public class Vwcustoproj01 implements java.io.Serializable {

	private Vwcustoproj01Id id;

	public Vwcustoproj01() {
	}

	public Vwcustoproj01(Vwcustoproj01Id id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP")),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL")),
			@AttributeOverride(name = "codcli", column = @Column(name = "CODCLI")),
			@AttributeOverride(name = "data", column = @Column(name = "DATA", length = 10)),
			@AttributeOverride(name = "desccusto", column = @Column(name = "DESCCUSTO", length = 200)),
			@AttributeOverride(name = "codcontr", column = @Column(name = "CODCONTR")),
			@AttributeOverride(name = "coditcontr", column = @Column(name = "CODITCONTR")),
			@AttributeOverride(name = "tpcontr", column = @Column(name = "TPCONTR", length = 1)),
			@AttributeOverride(name = "vlrprevrec", column = @Column(name = "VLRPREVREC", precision = 0, scale = 10)),
			@AttributeOverride(name = "qtdcusto", column = @Column(name = "QTDCUSTO", precision = 0, scale = 5)),
			@AttributeOverride(name = "vlrcusto", column = @Column(name = "VLRCUSTO", precision = 0, scale = 5)),
			@AttributeOverride(name = "tipocusto", column = @Column(name = "TIPOCUSTO", length = 1)) })
	public Vwcustoproj01Id getId() {
		return this.id;
	}

	public void setId(Vwcustoproj01Id id) {
		this.id = id;
	}

}
