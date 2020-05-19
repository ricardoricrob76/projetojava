/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bean;

import java.util.Date;

/**
 *
 * @author ricardoricr
 */
public class Pagamento {
    
    private int idpagamento;
    private double valorpg;
    private Date datapg;

    /**
     * @return the idpagamento
     */
    public int getIdpagamento() {
        return idpagamento;
    }

    /**
     * @param idpagamento the idpagamento to set
     */
    public void setIdpagamento(int idpagamento) {
        this.idpagamento = idpagamento;
    }

    /**
     * @return the valorpg
     */
    public double getValorpg() {
        return valorpg;
    }

    /**
     * @param valorpg the valorpg to set
     */
    public void setValorpg(double valorpg) {
        this.valorpg = valorpg;
    }

    /**
     * @return the datapg
     */
    public java.util.Date getDatapg() {
        return datapg;
    }

    /**
     * @param datapg the datapg to set
     */
    public void setDatapg(java.util.Date datapg) {
        this.datapg = datapg;
    }
    
    
    
    
}
