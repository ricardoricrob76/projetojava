/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador;
import DAO.*;
import Bean.*;
import Conexao.*;
import java.util.*;
import java.sql.SQLException;
/**
 *
 * @author ricardoricrob
 */
public class FachadaAnuncio {
  private ConexaoDBMysql conn = null;

   public FachadaAnuncio(){
        this.conn = ConexaoDBMysql.getInstance();
    }

    /**
     * @return the conn
     */
    public ConexaoDBMysql getConn() {
        return conn;
    }

    /**
     * @param conn the conn to set
     */
    public void setConn(ConexaoDBMysql conn) {
        this.conn = conn;
    }

    // Início dos Métodos da Fachada.
    public ArrayList<Anuncio> listagemGeralAnuncio() {
         ArrayList ob = new ArrayList();
       try {
           DAOAnuncio meuDAO = new DAOAnuncio(this.getConn());
           ob = meuDAO.list();
        } catch (Exception exception) {
           // System.out.println("Listagem dos Municípios não foi localizada.");
      }
       return ob;
    }

    public int inserirAnuncio(Anuncio obj) {
       int retorno = 0;
       try {
        DAOAnuncio meuDAO = new DAOAnuncio(this.getConn());
        retorno = meuDAO.insert(obj);

      } catch (Exception exception){
         System.out.println("Inclusão não foi realizada Ocorrencia.");
      }
       return  retorno;
    }
}
