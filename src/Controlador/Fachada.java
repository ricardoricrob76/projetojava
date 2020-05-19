/*
 * To change this template, choose Tools | Templates
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
public class Fachada {
  private ConexaoDBMysql conn = null;

   public Fachada(){
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

    // In�cio dos M�todos da Fachada.
    public ArrayList<Cliente> listagemGeralCliente() {
         ArrayList ob = new ArrayList();
       try {
           DAOCliente meuDAO = new DAOCliente(this.getConn());
           ob = meuDAO.list();
        } catch (Exception exception) {
           // System.out.println("Listagem dos Munic�pios n�o foi localizada.");
      }
       return ob;
    }

    public int inserirCliente(Cliente obj) {
       int retorno = 0;
       try {
        DAOCliente meuDAO = new DAOCliente(this.getConn());
        retorno = meuDAO.insert(obj);

      } catch (Exception exception){
         System.out.println("Inclus�o n�o foi realizada Ocorrencia.");
      }
       return  retorno;
    }

    public int removerCliente(Cliente obj){
        int retorno = 0;
        try{
            DAOCliente meuDao = new DAOCliente(this.getConn());
            retorno = meuDao.remover(obj);

        } catch (Exception exception){
            System.out.println("n�o apagou");
        }
        return retorno;
    }



     // In�cio dos M�todos da Fachada.
      public ArrayList<TipoAnuncio> listagemGeralTipoAnuncio() {
         ArrayList ob = new ArrayList();
       try {
           DAOTipoAnuncio meuDAO = new DAOTipoAnuncio(this.getConn());
           ob = meuDAO.list();
        } catch (Exception exception) {
           // System.out.println("Listagem dos Munic�pios n�o foi localizada.");
      }
       return ob;
    }

    public int inserirTipoAnuncio(TipoAnuncio obj) {
       int retorno = 0;
       try {
        DAOTipoAnuncio meuDAO = new DAOTipoAnuncio(this.getConn());
        retorno = meuDAO.insert(obj);

      } catch (Exception exception){
         System.out.println("Inclus�o n�o foi realizada Ocorrencia.");
      }
       return  retorno;
    }


      // In�cio dos M�todos da Fachada.
    public ArrayList<Sessao> listagemGeralSessao() {
         ArrayList ob = new ArrayList();
       try {
           DAOSessao meuDAO = new DAOSessao(this.getConn());
           ob = meuDAO.list();
        } catch (Exception exception) {
           // System.out.println("Listagem dos Munic�pios n�o foi localizada.");
      }
       return ob;
    }

    public int inserirSessao(Sessao obj) {
       int retorno = 0;
       try {
        DAOSessao meuDAO = new DAOSessao(this.getConn());
        retorno = meuDAO.insert(obj);

      } catch (Exception exception){
         System.out.println("Inclus�o n�o foi realizada Ocorrencia.");
      }
       return  retorno;
    }

          // In�cio dos M�todos da Fachada.
    public ArrayList<Funcionario> listagemGeralFuncionario() {
         ArrayList ob = new ArrayList();
       try {
           DAOFuncionario meuDAO = new DAOFuncionario(this.getConn());
           ob = meuDAO.list();
        } catch (Exception exception) {
           // System.out.println("Listagem dos Munic�pios n�o foi localizada.");
      }
       return ob;
    }

    public int inserirFuncionario(Funcionario obj) {
       int retorno = 0;
       try {
        DAOFuncionario meuDAO = new DAOFuncionario(this.getConn());
        retorno = meuDAO.insert(obj);

      } catch (Exception exception){
         System.out.println("Inclus�o n�o foi realizada Ocorrencia.");
      }
       return  retorno;
    }



       // In�cio dos M�todos da Fachada.

    public ArrayList<Fornecedor> listagemGeralFornecedor() {
         ArrayList ob = new ArrayList();
       try {
           DAOFornecedor meuDAO = new DAOFornecedor(this.getConn());
           ob = meuDAO.list();
        } catch (Exception exception) {
           // System.out.println("Listagem dos Munic�pios n�o foi localizada.");
      }
       return ob;
    }

    public int inserirFornecedor(Fornecedor obj) {
       int retorno = 0;
       try {
        DAOFornecedor meuDAO = new DAOFornecedor(this.getConn());
        retorno = meuDAO.insert(obj);

      } catch (Exception exception){
         System.out.println("Inclus�o n�o foi realizada Ocorrencia.");
      }
       return  retorno;
    }

    // Fim dos M�todos da Fachada.







}
