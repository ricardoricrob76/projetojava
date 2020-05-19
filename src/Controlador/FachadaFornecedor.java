/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Bean.Fornecedor;
import Conexao.ConexaoDBMysql;
import DAO.DAOFornecedor;
import java.util.ArrayList;

/**
 *
 * @author ricardoricr
 */
public class FachadaFornecedor {
    
      private ConexaoDBMysql conn = null;

   public FachadaFornecedor(){
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
    public ArrayList<Fornecedor> listagemGeralFornecedor() {
         ArrayList ob = new ArrayList();
       try {
           DAOFornecedor meuDAO = new DAOFornecedor(this.getConn());
           ob = meuDAO.list();
        } catch (Exception exception) {
           // System.out.println("Listagem dos Municípios não foi localizada.");
      }
       return ob;
    }

    public int inserirFornecedor(Fornecedor obj) {
       int retorno = 0;
       try {
        DAOFornecedor meuDAO = new DAOFornecedor(this.getConn());
        retorno = meuDAO.insert(obj);

      } catch (Exception exception){
         System.out.println("Inclusão não foi realizada Ocorrencia.");
      }
       return  retorno;
    }
    
    
    public int excluirFornecedor(Fornecedor obj) {
       int retorno = 0;
       try {
        DAOFornecedor meuDAO = new DAOFornecedor(this.getConn());
        retorno = meuDAO.remover(obj);

      } catch (Exception exception){
         System.out.println("Exclusão Realizada com Sucesso Ocorrencia.");
      }
       return  retorno;
    }
    
    
    
    
}
