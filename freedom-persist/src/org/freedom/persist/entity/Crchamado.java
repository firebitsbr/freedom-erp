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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Crchamado generated by hbm2java
 */
@Entity
@Table(name = "CRCHAMADO")
public class Crchamado implements java.io.Serializable {

	private CrchamadoId id;
	private Atatendente atatendente;
	private Vdcliente vdcliente;
	private Crtipochamado crtipochamado;
	private Vditcontrato vditcontrato;
	private Eqitrecmercitos eqitrecmercitos;
	private Crqualificacao crqualificacao;
	private String descchamado;
	private String fatogerador;
	private String ambiente;
	private String detchamado;
	private String obschamado;
	private String solicitante;
	private short prioridade;
	private String status;
	private Date dtchamado;
	private Date dtprevisao;
	private BigDecimal qtdhorasprevisao;
	private Date dtconclusao;
	private char ematendimento;
	private String emailsolicitante;
	private Date dtins;
	private Date hins;
	private String idusuins;
	private Date dtalt;
	private Date halt;
	private String idusualt;
	private Set crtarefas = new HashSet(0);
	private Set crchamadoanexos = new HashSet(0);
	private Set atatendimentos = new HashSet(0);
	private Set atmodatendos = new HashSet(0);

	public Crchamado() {
	}

	public Crchamado(CrchamadoId id, Vdcliente vdcliente,
			Crtipochamado crtipochamado, String descchamado,
			String solicitante, short prioridade, String status,
			Date dtchamado, Date dtprevisao, BigDecimal qtdhorasprevisao,
			char ematendimento, Date dtins, Date hins, String idusuins) {
		this.id = id;
		this.vdcliente = vdcliente;
		this.crtipochamado = crtipochamado;
		this.descchamado = descchamado;
		this.solicitante = solicitante;
		this.prioridade = prioridade;
		this.status = status;
		this.dtchamado = dtchamado;
		this.dtprevisao = dtprevisao;
		this.qtdhorasprevisao = qtdhorasprevisao;
		this.ematendimento = ematendimento;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
	}

	public Crchamado(CrchamadoId id, Atatendente atatendente,
			Vdcliente vdcliente, Crtipochamado crtipochamado,
			Vditcontrato vditcontrato, Eqitrecmercitos eqitrecmercitos,
			Crqualificacao crqualificacao, String descchamado,
			String fatogerador, String ambiente, String detchamado,
			String obschamado, String solicitante, short prioridade,
			String status, Date dtchamado, Date dtprevisao,
			BigDecimal qtdhorasprevisao, Date dtconclusao, char ematendimento,
			String emailsolicitante, Date dtins, Date hins, String idusuins,
			Date dtalt, Date halt, String idusualt, Set crtarefas,
			Set crchamadoanexos, Set atatendimentos, Set atmodatendos) {
		this.id = id;
		this.atatendente = atatendente;
		this.vdcliente = vdcliente;
		this.crtipochamado = crtipochamado;
		this.vditcontrato = vditcontrato;
		this.eqitrecmercitos = eqitrecmercitos;
		this.crqualificacao = crqualificacao;
		this.descchamado = descchamado;
		this.fatogerador = fatogerador;
		this.ambiente = ambiente;
		this.detchamado = detchamado;
		this.obschamado = obschamado;
		this.solicitante = solicitante;
		this.prioridade = prioridade;
		this.status = status;
		this.dtchamado = dtchamado;
		this.dtprevisao = dtprevisao;
		this.qtdhorasprevisao = qtdhorasprevisao;
		this.dtconclusao = dtconclusao;
		this.ematendimento = ematendimento;
		this.emailsolicitante = emailsolicitante;
		this.dtins = dtins;
		this.hins = hins;
		this.idusuins = idusuins;
		this.dtalt = dtalt;
		this.halt = halt;
		this.idusualt = idusualt;
		this.crtarefas = crtarefas;
		this.crchamadoanexos = crchamadoanexos;
		this.atatendimentos = atatendimentos;
		this.atmodatendos = atmodatendos;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codchamado", column = @Column(name = "CODCHAMADO", nullable = false)),
			@AttributeOverride(name = "codfilial", column = @Column(name = "CODFILIAL", nullable = false)),
			@AttributeOverride(name = "codemp", column = @Column(name = "CODEMP", nullable = false)) })
	public CrchamadoId getId() {
		return this.id;
	}

	public void setId(CrchamadoId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODATEND", referencedColumnName = "CODATEND"),
			@JoinColumn(name = "CODFILIALAE", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPAE", referencedColumnName = "CODEMP") })
	public Atatendente getAtatendente() {
		return this.atatendente;
	}

	public void setAtatendente(Atatendente atatendente) {
		this.atatendente = atatendente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCLI", referencedColumnName = "CODCLI", nullable = false),
			@JoinColumn(name = "CODFILIALCL", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPCL", referencedColumnName = "CODEMP", nullable = false) })
	public Vdcliente getVdcliente() {
		return this.vdcliente;
	}

	public void setVdcliente(Vdcliente vdcliente) {
		this.vdcliente = vdcliente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODTPCHAMADO", referencedColumnName = "CODTPCHAMADO", nullable = false),
			@JoinColumn(name = "CODFILIALTC", referencedColumnName = "CODFILIAL", nullable = false),
			@JoinColumn(name = "CODEMPTC", referencedColumnName = "CODEMP", nullable = false) })
	public Crtipochamado getCrtipochamado() {
		return this.crtipochamado;
	}

	public void setCrtipochamado(Crtipochamado crtipochamado) {
		this.crtipochamado = crtipochamado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODCONTR", referencedColumnName = "CODCONTR"),
			@JoinColumn(name = "CODITCONTR", referencedColumnName = "CODITCONTR"),
			@JoinColumn(name = "CODFILIALCT", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPCT", referencedColumnName = "CODEMP") })
	public Vditcontrato getVditcontrato() {
		return this.vditcontrato;
	}

	public void setVditcontrato(Vditcontrato vditcontrato) {
		this.vditcontrato = vditcontrato;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "TICKET", referencedColumnName = "TICKET"),
			@JoinColumn(name = "CODITRECMERC", referencedColumnName = "CODITRECMERC"),
			@JoinColumn(name = "CODITOS", referencedColumnName = "CODITOS"),
			@JoinColumn(name = "CODFILIALOS", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPOS", referencedColumnName = "CODEMP") })
	public Eqitrecmercitos getEqitrecmercitos() {
		return this.eqitrecmercitos;
	}

	public void setEqitrecmercitos(Eqitrecmercitos eqitrecmercitos) {
		this.eqitrecmercitos = eqitrecmercitos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CODFILIALQL", referencedColumnName = "CODFILIAL"),
			@JoinColumn(name = "CODEMPQL", referencedColumnName = "CODEMP"),
			@JoinColumn(name = "CODQUALIFIC", referencedColumnName = "CODQUALIFIC") })
	public Crqualificacao getCrqualificacao() {
		return this.crqualificacao;
	}

	public void setCrqualificacao(Crqualificacao crqualificacao) {
		this.crqualificacao = crqualificacao;
	}

	@Column(name = "DESCCHAMADO", nullable = false, length = 100)
	public String getDescchamado() {
		return this.descchamado;
	}

	public void setDescchamado(String descchamado) {
		this.descchamado = descchamado;
	}

	@Column(name = "FATOGERADOR", length = 1000)
	public String getFatogerador() {
		return this.fatogerador;
	}

	public void setFatogerador(String fatogerador) {
		this.fatogerador = fatogerador;
	}

	@Column(name = "AMBIENTE", length = 1000)
	public String getAmbiente() {
		return this.ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	@Column(name = "DETCHAMADO", length = 1000)
	public String getDetchamado() {
		return this.detchamado;
	}

	public void setDetchamado(String detchamado) {
		this.detchamado = detchamado;
	}

	@Column(name = "OBSCHAMADO", length = 1000)
	public String getObschamado() {
		return this.obschamado;
	}

	public void setObschamado(String obschamado) {
		this.obschamado = obschamado;
	}

	@Column(name = "SOLICITANTE", nullable = false, length = 50)
	public String getSolicitante() {
		return this.solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	@Column(name = "PRIORIDADE", nullable = false)
	public short getPrioridade() {
		return this.prioridade;
	}

	public void setPrioridade(short prioridade) {
		this.prioridade = prioridade;
	}

	@Column(name = "STATUS", nullable = false, length = 2)
	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTCHAMADO", nullable = false, length = 10)
	public Date getDtchamado() {
		return this.dtchamado;
	}

	public void setDtchamado(Date dtchamado) {
		this.dtchamado = dtchamado;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTPREVISAO", nullable = false, length = 10)
	public Date getDtprevisao() {
		return this.dtprevisao;
	}

	public void setDtprevisao(Date dtprevisao) {
		this.dtprevisao = dtprevisao;
	}

	@Column(name = "QTDHORASPREVISAO", nullable = false, precision = 15, scale = 5)
	public BigDecimal getQtdhorasprevisao() {
		return this.qtdhorasprevisao;
	}

	public void setQtdhorasprevisao(BigDecimal qtdhorasprevisao) {
		this.qtdhorasprevisao = qtdhorasprevisao;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTCONCLUSAO", length = 10)
	public Date getDtconclusao() {
		return this.dtconclusao;
	}

	public void setDtconclusao(Date dtconclusao) {
		this.dtconclusao = dtconclusao;
	}

	@Column(name = "EMATENDIMENTO", nullable = false, length = 1)
	public char getEmatendimento() {
		return this.ematendimento;
	}

	public void setEmatendimento(char ematendimento) {
		this.ematendimento = ematendimento;
	}

	@Column(name = "EMAILSOLICITANTE", length = 60)
	public String getEmailsolicitante() {
		return this.emailsolicitante;
	}

	public void setEmailsolicitante(String emailsolicitante) {
		this.emailsolicitante = emailsolicitante;
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

	/*@OneToMany(fetch = FetchType.LAZY, mappedBy = "crchamado")
	public Set getCrtarefas() {
		return this.crtarefas;
	}

	public void setCrtarefas(Set crtarefas) {
		this.crtarefas = crtarefas;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "crchamado")
	public Set getCrchamadoanexos() {
		return this.crchamadoanexos;
	}

	public void setCrchamadoanexos(Set crchamadoanexos) {
		this.crchamadoanexos = crchamadoanexos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "crchamado")
	public Set getAtatendimentos() {
		return this.atatendimentos;
	}

	public void setAtatendimentos(Set atatendimentos) {
		this.atatendimentos = atatendimentos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "crchamado")
	public Set getAtmodatendos() {
		return this.atmodatendos;
	}

	public void setAtmodatendos(Set atmodatendos) {
		this.atmodatendos = atmodatendos;
	}
*/
}
