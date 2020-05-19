/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Relatorio;

/**
 *
 * @author ricardoricrob
 */
import java.sql.Connection;import java.sql.DriverManager;import java.sql.ResultSet;import java.sql.SQLException;import java.sql.Statement;import java.util.HashMap;import java.util.Map;
//import net.sf.jasperreports.engine.JRException;
//import net.sf.jasperreports.engine.JRResultSetDataSource;
//import net.sf.jasperreports.engine.JasperCompileManager;
//import net.sf.jasperreports.engine.JasperExportManager;
//import net.sf.jasperreports.engine.JasperFillManager;
//import net.sf.jasperreports.engine.JasperPrint;
//import net.sf.jasperreports.engine.JasperReport;
//import net.sf.jasperreports.engine.design.JasperDesign;
//import net.sf.jasperreports.engine.xml.JRXmlLoader;
//import net.sf.jasperreports.view.JasperViewer;

public class RelatorioClientes {
/* Realiza conexão com o banco de dados, retornando o objeto Connection */
// private static Connection getConnection( ) throws
//ClassNotFoundException, SQLException
// {
//   String driver = "org.gjt.mm.mysql.Driver";
//   String url = "jdbc:mysql://127.0.0.1/dbclassificados";
//   String user = "root";
//   String password = "72255560";
//
//   Class.forName(driver);
//   Connection con = DriverManager.getConnection( url, user, password );
//   return con;
// }
// /* Gera Relatorio e visualiza-o */
// public void geraRelatorio() throws JRException, Exception
// {
//   Connection con = getConnection( );
//   Statement stm = con.createStatement( );
//   String query = "select * from cliente";
//   ResultSet rs =  stm.executeQuery( query );
///* implementação da interface JRDataSource para DataSource ResultSet */
//   JRResultSetDataSource jrRS = new JRResultSetDataSource( rs );
//
//   /* HashMap de parametros utilizados no relatório. Sempre instanciados */
//   Map parameters = new HashMap();
//  // parameters.put("COLUNA", valor);
//
//   /* Preenche o relatório com os dados. Gera o arquivo BibliotecaPessoal.jrprint */
//   JasperFillManager.fillReportToFile( "C:/Users/ricardoricrob/Documents/NetBeansProjects/ProjetoDesktopClassificados/src/Relatorio/reportModeloPredefinido.jasper", parameters, jrRS );
//    /* Exporta para o formato PDF */
//
//   JasperExportManager.exportReportToPdfFile( "C:/Users/ricardoricrob/Documents/NetBeansProjects/ProjetoDesktopClassificados/src/Relatorio/reportModeloPredefinido.jrprint" );
//   /* Preenche o relatorio e o salva diretamente em arquivo PDF. Sem
//       a necessidade do .jrprint */
//   // JasperRunManager.runReportToPdfFile("BibliotecaPessoal.jasper", parameters, jrRS);
//
//   /* Visualiza o relatório em formato PDF */
//   JasperViewer.viewReport( "C:/Users/ricardoricrob/Documents/NetBeansProjects/ProjetoDesktopClassificados/src/Relatorio/reportModeloPredefinido.pdf", false );
// }
//
//   public static void main(String[] args) throws JRException, Exception
//   {
//     new RelatorioClientes().geraRelatorio();
//   }
//
//
//}
//
////public class RelatorioClientes {
////
////	private static final String url = "jdbc:mysql://127.0.0.1/dbclassificados";
////	private static final String driver = "org.gjt.mm.mysql.Driver";
////	private static final String login = "root";
////	private static final String pwd = "72255560";
////
////	public RelatorioClientes() {
//////            try {
//////		    new RelatorioClientes().gerar("reportModeloPredefinido.jasper");
//////		} catch (Exception e) {
//////		    e.printStackTrace();
//////		}
////	}
////
////	public void gerar( String layout ) throws JRException , SQLException, ClassNotFoundException {
////		//gerando o jasper design
////		JasperDesign desenho = JRXmlLoader.load( layout );
////
////		//compila o relatório
////		JasperReport relatorio = JasperCompileManager.compileReport( desenho );
////
////		//estabelece conexão
////		Class.forName( driver );
////		Connection con = DriverManager.getConnection( url , login , pwd );
////		Statement stm = con.createStatement();
////		String query = "select * from cliente";
////		ResultSet rs = stm.executeQuery( query );
////
////		//implementação da interface JRDataSource para DataSource ResultSet
////		JRResultSetDataSource jrRS = new JRResultSetDataSource( rs );
////
////		//executa o relatório
////		Map parametros = new HashMap();
////		parametros.put("nota", new Double(10));
////		JasperPrint impressao = JasperFillManager.fillReport( relatorio , parametros,    jrRS );
////
////		//exibe o resultado
////		JasperViewer viewer = new JasperViewer( impressao , true );
////		viewer.show();
////	}
////
////	public static void main(String[] args) {
////		try {
////		    new RelatorioClientes().gerar("/reportModeloPredefinido.jasper");
////		} catch (Exception e) {
////		    e.printStackTrace();
////		}
////	}
}


