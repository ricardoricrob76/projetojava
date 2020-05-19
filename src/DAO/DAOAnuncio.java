/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexao.ConexaoDBMysql;
//import Controlador.*;
import Bean.Anuncio;

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

public class DAOAnuncio {

    private ConexaoDBMysql co = ConexaoDBMysql.getInstance();
    private String sql = "",  sql1 = "";
    private PreparedStatement stmt = null;

    public DAOAnuncio(ConexaoDBMysql conn) {
        this.co = conn;
    }

    public ArrayList list() throws SQLException {
    ArrayList list = new ArrayList();
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      conn = co.getConnection();
      String sql = "SELECT textotitulo, preco, textoanuncio, nomecontato, telefone1, telefone2, datainsercao, ie_tipoanuncio, ie_cliente, ie_sessao  FROM anuncio order by textotitulo";
      pstmt = conn.prepareStatement(sql);
      rs = pstmt.executeQuery();
      while(rs.next()) {
        Anuncio a = new Anuncio();
        a.setTextoTitulo(rs.getString(1));
        a.setPreco(rs.getDouble(2));
        a.setTextoAnuncio(rs.getString(3));
        a.setNomeContato(rs.getString(4));
        a.setTelefone1(rs.getString(5));
        a.setTelefone2(rs.getString(6));
        a.setDataInsercao(rs.getString(7));
        a.setIetipoAnuncio(rs.getInt(8));
        a.setIeCliente(rs.getInt(9));
        a.setIeSessao(rs.getInt(10));
           
        list.add(a);
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

    public int insert(Anuncio anuncio) throws SQLException {
    String sql;
    int a = 0;
    sql = "INSERT INTO Anuncio (textotitulo, preco, textoanuncio, nomecontato, telefone1, telefone2, datainsercao, ie_tipoanuncio, ie_cliente, ie_sessao) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    Connection conn = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
      conn = co.getConnection();
      pstmt = conn.prepareStatement(sql);
      
      pstmt.setString(1, anuncio.getTextoTitulo());
      pstmt.setDouble(2, anuncio.getPreco());
      pstmt.setString(3, anuncio.getTextoAnuncio());
      pstmt.setString(4, anuncio.getNomeContato());
      pstmt.setString(5, anuncio.getTelefone1());
      pstmt.setString(6, anuncio.getTelefone2());
      pstmt.setString(7, anuncio.getDataInsercao());
      pstmt.setInt(8, anuncio.getIetipoAnuncio());
      pstmt.setInt(9, anuncio.getIeCliente());
      pstmt.setInt(10, anuncio.getIeSessao());
      
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

    public int remover(Anuncio anuncio) throws SQLException{
        int a = 0;
        String sql;
         sql = "DELETE from Anuncio where idanuncio = ?";
         Connection conn = null;
         PreparedStatement pstmt = null;
         ResultSet rs = null;
         try {
        conn = co.getConnection();
      pstmt = conn.prepareStatement(sql);
      pstmt.setInt(1, anuncio.getIdAnuncio());
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

}


