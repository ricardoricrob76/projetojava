package DAO;

import Conexao.ConexaoDBMysql;
//import Controlador.*;
import Bean.Fornecedor;

import java.sql.*;
import javax.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ricardoricrob
 */

public class DAOFornecedor {

    private ConexaoDBMysql co = ConexaoDBMysql.getInstance();
    private String sql = "",  sql1 = "";
    private PreparedStatement stmt = null;

    public DAOFornecedor(ConexaoDBMysql conn) {
        this.co = conn;
    }

    public ArrayList list() throws SQLException {
    ArrayList list = new ArrayList();
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      conn = co.getConnection();
      String sql = "SELECT idfornecedor, nomefantasia, cnpj, email from fornecedor order by nomefantasia";
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while(rs.next()) {
        Fornecedor c = new Fornecedor();
        c.setIdfornecedor(rs.getInt(1));
        c.setNomefantasia(rs.getString(2));
        c.setCnpj(rs.getString(3));
        c.setEmail(rs.getString(4));
        
        list.add(c);
        
      }
      rs.close();
      pstmt.close();
    } catch (SQLException e) {
      rs.close();
      pstmt.close();
      conn.rollback();
      e.printStackTrace();
    } finally {
    	co.devolveconexao(conn);
    }
    return list;
  }

    public int insert(Fornecedor fornecedor) throws SQLException {
    String sql;
    int a = 0;
    sql = "INSERT INTO fornecedor (idfornecedor, nomefantasia, cnpj, email) VALUES (?, ?, ?, ?)";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      conn = co.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, fornecedor.getIdfornecedor());
      pstmt.setString(2, fornecedor.getNomefantasia());
      pstmt.setString(3, fornecedor.getCnpj());
      pstmt.setString(4, fornecedor.getEmail());
    //  pstmt.setString(4, cliente.getAssinante());
      a = pstmt.executeUpdate();
      pstmt.close();
//      conn.commit();
//      JOptionPane.showMessageDialog(null,"Registro Gravado com Sucesso");
      return a;
    } catch (SQLException sqle) {

      sqle.printStackTrace();
      throw sqle;
    } finally {
    	co.devolveconexao(conn);
    }
  }

    public int remover(Fornecedor fornecedor) throws SQLException{
        int a = 0;
        String sql;
         sql = "DELETE from fornecedor where idfornecedor = ?";
         Connection conn = null;
         PreparedStatement pstmt = null;
         ResultSet rs = null;
         try {
       conn = co.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, fornecedor.getIdfornecedor());
      a = pstmt.executeUpdate();
      pstmt.close();
      conn.commit();
      JOptionPane.showMessageDialog(null,"Registro Gravado com Sucesso");
      return a;
    } catch (SQLException sqle) {
      sqle.printStackTrace();
      throw sqle;
    } finally {
    	co.devolveconexao(conn);
    }


    }

}


