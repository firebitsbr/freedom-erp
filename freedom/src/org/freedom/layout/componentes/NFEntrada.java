/**
 * @version 08/08/2005 <BR>
 * @author Setpoint Inform�tica Ltda./Robson Sanchez <BR>
 * 
 * Projeto: Freedom <BR>
 * 
 * Pacote: org.freedom.layout <BR>
 * Classe:
 * @(#)NFEntrada.java <BR>
 * 
 * Este programa � licenciado de acordo com a LPG-PC (Licen�a P�blica Geral para Programas de Computador), <BR>
 * vers�o 2.1.0 ou qualquer vers�o posterior. <BR>
 * A LPG-PC deve acompanhar todas PUBLICA��ES, DISTRIBUI��ES e REPRODU��ES deste Programa. <BR>
 * Caso uma c�pia da LPG-PC n�o esteja dispon�vel junto com este Programa, voc� pode contatar <BR>
 * o LICENCIADOR ou ent�o pegar uma c�pia em: <BR>
 * Licen�a: http://www.lpg.adv.br/licencas/lpgpc.rtf <BR>
 * Para poder USAR, PUBLICAR, DISTRIBUIR, REPRODUZIR ou ALTERAR este Programa � preciso estar <BR>
 * de acordo com os termos da LPG-PC <BR>
 * <BR>
 * 
 * Coment�rios sobre a classe...
 * 
 */

package org.freedom.layout.componentes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import org.freedom.componentes.NF;
import org.freedom.componentes.TabVector;
import org.freedom.funcoes.Funcoes;

public class NFEntrada extends NF {

	protected int tipoNF = TPNF_ENTRADA;

	public NFEntrada( int casasDec ) {

		super( casasDec );
	}

	public int getTipoNF() {

		return this.tipoNF;
	}

	public boolean carregaTabelas( Connection con, Vector parans ) {

		boolean retorno = true;
		PreparedStatement ps = null;
		ResultSet rs = null;
		StringBuffer sql = new StringBuffer();
		int cont = 0;
		try {

			setConexao( con );

			sql.append( "SELECT C.CODCOMPRA, C.CODFOR, F.RAZFOR,  F.CNPJFOR, F.CPFFOR, F.ENDFOR, F.NUMFOR, F.COMPLFOR," ); 
			sql.append( "F.BAIRFOR, F.CEPFOR, F.CIDFOR, F.UFFOR, F.FONEFOR, F.FAXFOR, F.DDDFONEFOR, F.INSCFOR, F.RGFOR, " );
			sql.append( "C.VLRDESCITCOMPRA, F.EMAILFOR, F.SITEFOR, F.CONTFOR, C.DTEMITCOMPRA, C.DOCCOMPRA, C.DTENTCOMPRA, " );
			sql.append( "C.CODPLANOPAG, PG.DESCPLANOPAG, C.CODBANCO, " );
			sql.append( "(SELECT B.NOMEBANCO FROM FNBANCO B WHERE B.CODEMP=C.CODEMPBO AND B.CODFILIAL=C.CODFILIALBO AND B.CODBANCO=C.CODBANCO), " );
			sql.append( "C.VLRLIQCOMPRA,C.VLRPRODCOMPRA,C.VLRADICCOMPRA,C.VLRICMSCOMPRA,C.VLRBASEICMSCOMPRA,C.VLRIPICOMPRA, " );
			sql.append( "C.VLRFRETECOMPRA "  );
			sql.append( "FROM CPCOMPRA C, CPFORNECED F, FNPLANOPAG PG " );
			sql.append( "WHERE F.CODEMP=C.CODEMPFR AND F.CODFILIAL=C.CODFILIALFR AND F.CODFOR=C.CODFOR " );
			sql.append( "AND PG.CODEMP=C.CODEMPPG AND PG.CODFILIAL=C.CODFILIALPG AND PG.CODPLANOPAG=C.CODPLANOPAG " );
			sql.append( "AND C.CODEMP=? AND C.CODFILIAL=? AND C.CODCOMPRA=?" );
			ps = con.prepareStatement( sql.toString() );
			ps.setInt( 1, ( (Integer) parans.elementAt( 0 ) ).intValue() );
			ps.setInt( 2, ( (Integer) parans.elementAt( 1 ) ).intValue() );
			ps.setInt( 3, ( (Integer) parans.elementAt( 2 ) ).intValue() );
			rs = ps.executeQuery();
			cont++;
			cab = new TabVector( 61 );
			while ( rs.next() ) {
				cab.addRow();
				cab.setInt( C_CODPED, rs.getInt( "CODCOMPRA" ) );
				cab.setInt( C_CODEMIT, rs.getInt( "CODFOR" ) );
				cab.setString( C_RAZEMIT, rs.getString( "RAZFOR" ) != null ? rs.getString( "RAZFOR" ) : "" );
				cab.setString( C_CNPJEMIT, rs.getString( "CNPJFOR" ) != null ? rs.getString( "CNPJFOR" ) : "" );
				cab.setString( C_CPFEMIT, rs.getString( "CPFFOR" ) != null ? rs.getString( "CPFFOR" ) : "" );
				cab.setString( C_ENDEMIT, rs.getString( "ENDFOR" ) != null ? rs.getString( "ENDFOR" ) : "" );
				cab.setInt( C_NUMEMIT, rs.getInt( "NUMFOR" ) );
				cab.setString( C_COMPLEMIT, rs.getString( "COMPLFOR" ) != null ? rs.getString( "COMPLFOR" ) : "" );
				cab.setString( C_BAIREMIT, rs.getString( "BAIRFOR" ) != null ? rs.getString( "BAIRFOR" ) : "" );
				cab.setString( C_CEPEMIT, rs.getString( "CEPFOR" ) != null ? rs.getString( "CEPFOR" ) : "" );
				cab.setString( C_CIDEMIT, rs.getString( "CIDFOR" ) != null ? rs.getString( "CIDFOR" ) : "" );
				cab.setString( C_UFEMIT, rs.getString( "UFFOR" ) != null ? rs.getString( "UFFOR" ) : "" );
				cab.setString( C_FONEEMIT, rs.getString( "FONEFOR" ) != null ? rs.getString( "FONEFOR" ) : "" );
				cab.setString( C_FAXEMIT, rs.getString( "FAXFOR" ) != null ? rs.getString( "FAXFOR" ) : "" );
				cab.setString( C_DDDEMIT, rs.getString( "DDDFONEFOR" ) != null ? rs.getString( "DDDFONEFOR" ) : "" );
				cab.setString( C_INSCEMIT, rs.getString( "INSCFOR" ) != null ? rs.getString( "INSCFOR" ) : "" );
				cab.setString( C_RGEMIT, rs.getString( "RGFOR" ) != null ? rs.getString( "RGFOR" ) : "" );
				cab.setString( C_EMAILEMIT, rs.getString( "EMAILFOR" ) != null ? rs.getString( "EMAILFOR" ) : "" );
				cab.setString( C_SITEEMIT, rs.getString( "SITEFOR" ) != null ? rs.getString( "SITEFOR" ) : "" );
				cab.setString( C_CONTEMIT, rs.getString( "CONTFOR" ) != null ? rs.getString( "CONTFOR" ) : "" );
				cab.setDate( C_DTEMITPED, rs.getDate( "DTEMITCOMPRA" ) );
				cab.setInt( C_DOC, rs.getInt( "DOCCOMPRA" ) );
				cab.setString( C_INCRAEMIT, "" );
				cab.setDate( C_DTSAIDA, rs.getDate( "DTENTCOMPRA" ) );
				cab.setString( C_CODPLANOPG, ( rs.getString( "CODPLANOPAG" ) != null ? rs.getString( "CODPLANOPAG" ) : "" ) );
				cab.setString( C_DESCPLANOPAG, ( rs.getString( "DESCPLANOPAG" ) != null ? rs.getString( "DESCPLANOPAG" ) : "" ) );
				cab.setString( C_OBSPED, "" );
				cab.setString( C_NOMEVEND, "" );
				cab.setString( C_EMAILVEND, "" );
				cab.setString( C_DESCFUNC, "" );
				cab.setString( C_CODCLCOMIS, "" );
				cab.setFloat( C_PERCCOMISVENDA, 0 );
				cab.setInt( C_CODVEND, 0 );
				cab.setString( C_ENDCOBEMIT, "" );
				cab.setString( C_CIDCOBEMIT, "" );
				cab.setString( C_UFCOBEMIT, "" );
				cab.setString( C_BAIRCOBEMIT, "" );
				cab.setInt( C_NUMCOBEMIT, 0 );
				cab.setFloat( C_PERCMCOMISPED, 0 );
				cab.setString( C_NOMEEMIT, "" );
				cab.setString( C_ENDENTEMIT, "" );
				cab.setInt( C_NUMENTEMIT, 0 );
				cab.setString( C_COMPLENTEMIT, "" );
				cab.setString( C_BAIRENTEMIT, "" );
				cab.setString( C_CIDENTEMIT, "" );
				cab.setString( C_UFENTEMIT, "" );
				cab.setString( C_CODBANCO, ( rs.getString( "CODBANCO" ) != null ? rs.getString( "CODBANCO" ).trim() : "" ) );
				cab.setString( C_NOMEBANCO, ( rs.getString( 28 ) != null ? rs.getString( 28 ).trim() : "" ) );
				cab.setString( C_DESCSETOR, "" );
				cab.setFloat( C_VLRDESCITPED, rs.getFloat( "VLRDESCITCOMPRA" ) );
				cab.setInt( C_DIASPAG, 0 );
				cab.setString( C_PEDEMIT, "" );
				cab.setFloat( C_VLRLIQPED, rs.getFloat( "VLRLIQCOMPRA" ) );
				cab.setFloat( C_VLRPRODPED, rs.getFloat( "VLRPRODCOMPRA" ) );
				cab.setFloat( C_VLRADICPED, rs.getFloat( "VLRADICCOMPRA" ) );
				cab.setFloat( C_VLRICMSPED, rs.getFloat( "VLRICMSCOMPRA" ) );
				cab.setFloat( C_VLRBASEICMSPED, rs.getFloat( "VLRBASEICMSCOMPRA" ) );
				cab.setFloat( C_VLRIPIPED, rs.getFloat( "VLRIPICOMPRA" ) );				
				cab.setFloat( C_BASEISS, 0 );
				cab.setFloat( C_VLRISS, 0 );
				cab.setFloat( C_VLRFRETEPED, rs.getFloat( "VLRFRETECOMPRA" ) );				
			}
			rs.close();
			ps.close();
			if ( !con.getAutoCommit() )
				con.commit();
			cab.setRow( -1 );

			sql = new StringBuffer();
			sql.append( "SELECT I.CODITCOMPRA, I.CODPROD, I.QTDITCOMPRA, I.VLRLIQITCOMPRA, I.PERCIPIITCOMPRA, I.VLRIPIITCOMPRA, " );
			sql.append( "I.PERCICMSITCOMPRA, I.VLRPRODITCOMPRA, C.VLRBASEIPICOMPRA, P.REFPROD, P.DESCPROD, P.CODUNID, " );
			sql.append( "I.CODNAT, N.DESCNAT, N.IMPDTSAIDANAT, I.CODLOTE, P.CODFISC, P.TIPOPROD, I.VLRDESCITCOMPRA, " );
			sql.append( "I.VLRADICITCOMPRA, ");
			sql.append( "(SELECT L.VENCTOLOTE FROM EQLOTE L WHERE L.CODEMP=I.CODEMPLE AND L.CODFILIAL=I.CODFILIALLE AND ");
			sql.append(	"L.CODPROD=I.CODPROD AND L.CODLOTE=I.CODLOTE) VENCTOLOTE, " );
			sql.append( "(SELECT COUNT(IC.CODITCOMPRA) FROM CPITCOMPRA IC WHERE IC.CODCOMPRA=C.CODCOMPRA AND ");
			sql.append( "IC.CODEMP=C.CODEMP AND IC.CODFILIAL=C.CODFILIAL) QTDITENS, " );
			sql.append(	"(SELECT M.MENS FROM LFMENSAGEM M WHERE M.CODMENS=CL.CODMENS AND ");
			sql.append( "M.CODFILIAL=CL.CODFILIALME AND M.CODEMP=CL.CODEMPME) MENS " );
			sql.append( "FROM CPITCOMPRA I, CPCOMPRA C, EQPRODUTO P, LFNATOPER N, LFCLFISCAL CL " ); 
			sql.append( "WHERE I.CODEMP=C.CODEMP AND I.CODFILIAL=C.CODFILIAL AND I.CODCOMPRA=C.CODCOMPRA " );
			sql.append( "AND I.CODNAT=N.codnat AND I.CODEMPNT=N.CODEMP AND I.CODFILIALNT=N.CODFILIAL " );
			sql.append( "AND I.CODPROD=P.CODPROD AND I.CODEMPPD=P.CODEMP AND I.CODFILIALPD=P.CODFILIAL " );
			sql.append( "AND CL.CODFISC=P.CODFISC AND CL.CODEMP=P.CODEMPFC AND CL.CODFILIAL=P.CODFILIALFC " );
			sql.append( "AND C.CODEMP=? AND C.CODFILIAL=? AND C.CODCOMPRA=?" );
			ps = con.prepareStatement( sql.toString() );
			ps.setInt( 1, ( (Integer) parans.elementAt( 0 ) ).intValue() );
			ps.setInt( 2, ( (Integer) parans.elementAt( 1 ) ).intValue() );
			ps.setInt( 3, ( (Integer) parans.elementAt( 2 ) ).intValue() );
			rs = ps.executeQuery();
			cont++;
			itens = new TabVector( 27 );
			while ( rs.next() ) {
				itens.addRow();
				itens.setInt( C_CODITPED, rs.getInt( "CODITCOMPRA" ) );
				itens.setInt( C_CODPROD, rs.getInt( "CODPROD" ) );
				itens.setString( C_REFPROD, rs.getString( "REFPROD" ) != null ? rs.getString( "REFPROD" ) : "" );
				itens.setString( C_DESCPROD, rs.getString( "DESCPROD" ) != null ? rs.getString( "DESCPROD" ) : "" );
				itens.setString( C_OBSITPED, "" );
				itens.setString( C_CODUNID, rs.getString( "CODUNID" ) != null ? rs.getString( "CODUNID" ) : "" );
				itens.setFloat( C_QTDITPED, rs.getFloat( "QTDITCOMPRA" ) );
				itens.setFloat( C_VLRLIQITPED, rs.getFloat( "VLRLIQITCOMPRA" ) );
				itens.setFloat( C_PERCIPIITPED, rs.getFloat( "PERCIPIITCOMPRA" ) );
				itens.setFloat( C_PERCICMSITPED, rs.getFloat( "PERCICMSITCOMPRA" ) );
				itens.setFloat( C_VLRIPIITPED, rs.getFloat( "VLRIPIITCOMPRA" ) );
				itens.setString( C_IMPDTSAIDA, rs.getString( "IMPDTSAIDANAT" ) != null ? rs.getString( "IMPDTSAIDANAT" ) : "" );
				itens.setFloat( C_VLRPRODITPED, rs.getFloat( "VLRPRODITCOMPRA" ) );
				itens.setString( C_DESCNAT, rs.getString( "DESCNAT" ) != null ? rs.getString( "DESCNAT" ) : "" );
				itens.setInt( C_CODNAT, rs.getInt( "CODNAT" ) );
				itens.setString( C_CODLOTE, rs.getString( "CODLOTE" ) != null ? rs.getString( "CODLOTE" ) : "" );
				itens.setDate( C_VENCLOTE, rs.getDate( "VENCTOLOTE" ) );
				itens.setString( C_ORIGFISC, "" );
				itens.setString( C_CODTRATTRIB, "" );
				itens.setFloat( C_VLRADICITPED, rs.getFloat( "VLRADICITCOMPRA" ) );
				itens.setInt( C_CONTAITENS, rs.getInt( "QTDITENS" ) );
				itens.setString( C_DESCFISC, ( rs.getString( "MENS" ) != null ? rs.getString( "MENS" ) : "" ) );
				itens.setString( C_DESCFISC2, "" );
				itens.setString( C_CODFISC, rs.getString( "CODFISC" ) != null ? rs.getString( "CODFISC" ) : "" );
				itens.setString( C_TIPOPROD, rs.getString( "TIPOPROD" ) != null ? rs.getString( "TIPOPROD" ) : "" );
				itens.setFloat( C_VLRISSITPED, 0f );
				itens.setFloat( C_VLRDESCITPROD, rs.getFloat( "VLRDESCITCOMPRA" ) );
			}
			rs.close();
			ps.close();
			if ( !con.getAutoCommit() )
				con.commit();
			itens.setRow( -1 );

			adic = new TabVector( 5 );
			/*
			 * adic.addRow(); adic.setInt(C_CODAUXV, 0); adic.setInt(C_CPFEMITAUX, 0); adic.setString(C_NOMEEMITAUX, ""); adic.setString(C_CIDEMITAUX, ""); adic.setString(C_UFEMITAUX, ""); adic.setRow(-1);
			 */

			parc = new TabVector( 3 );
			/*
			 * parc.addRow(); parc.setDate(C_DTVENCTO, null); parc.setFloat(C_VLRPARC, 0); parc.setInt(C_NPARCITREC, 0); parc.setRow(-1);
			 */

			frete = new TabVector( 21 );
			frete.addRow();
			frete.setInt( C_CODTRAN, 0 );
			frete.setString( C_RAZTRANSP, "" );
			frete.setString( C_NUMTRANSP, "" );
			frete.setString( C_INSCTRANSP, "" );
			frete.setString( C_CNPJTRANSP, "" );
			frete.setString( C_TIPOTRANSP, "" );
			frete.setString( C_ENDTRANSP, "" );
			frete.setInt( C_NUMTRANSP, 0 );
			frete.setString( C_CIDTRANSP, "" );
			frete.setString( C_UFTRANSP, "" );
			frete.setString( C_TIPOFRETE, "" );
			frete.setString( C_PLACAFRETE, "" );
			frete.setString( C_UFFRETE, "" );
			frete.setFloat( C_QTDFRETE, 0 );
			frete.setString( C_ESPFRETE, "" );
			frete.setString( C_MARCAFRETE, "" );
			frete.setFloat( C_PESOBRUTO, 0 );
			frete.setFloat( C_PESOLIQ, 0 );
			frete.setFloat( C_VLRFRETEPED, 0 );
			frete.setString( C_CONHECFRETEPED, "" );
			frete.setRow( -1 );

		} catch ( SQLException e ) {
			Funcoes.mensagemErro( null, "Erro na NFEntrada\n" + cont + "\n" + e.getMessage() );
			e.printStackTrace();
			retorno = false;
		} finally {
			rs = null;
			ps = null;
		}
		return retorno;
	}
}
