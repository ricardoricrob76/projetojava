/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Conexao;

import java.sql.*;

public class ConexaoDBMysql {

//  static ResourceBundle res = ResourceBundle.getBundle("siscep.Res");
  private static boolean DEBUG = false;
  private Connection connection;
  private final String driver = "org.gjt.mm.mysql.Driver";
 // Parametros de Produção - Tauceti.
  private static ConexaoDBMysql rep = new ConexaoDBMysql();
  private ConexaoDBMysql() { }

  public static  synchronized ConexaoDBMysql getInstance(){
      if (rep == null){
          rep = new ConexaoDBMysql();
      }
      return rep;
  }

  public static Connection getConnection() throws SQLException {
    Connection connection = null;
    try {
      connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbclassificados"+"?user=root&password=72255560");
    }
    catch (SQLException sex) {
       throw new SQLException(sex.getMessage());
     }
    return connection;
  }
  public static void devolveconexao(Connection connection) throws SQLException {
   try {
     connection.close();
   }
   catch (Exception ex) {
        throw new SQLException(ex.getMessage());
   }

  }
}//Fim de Classe
