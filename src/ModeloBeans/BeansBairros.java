/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

/**
 *
 * @author João & Queillia
 */
public class BeansBairros {
    
    private int idBairros;
    private String NomeBairro;
    private int idCidade;
    
    public BeansBairros(){}
    
    public BeansBairros(int id, String NomeBairro) {
        this.idBairros = id;
        this.NomeBairro = NomeBairro;
    }

    public int getIdBairros() {
        return idBairros;
    }

    public void setIdBairros(int idBairros) {
        this.idBairros = idBairros;
    }

    public String getNomeBairro() {
        return NomeBairro;
    }

    public void setNomeBairro(String NomeBairro) {
        this.NomeBairro = NomeBairro;
    }

    public int getIdCidade() {
        return idCidade;
    }

    public void setIdCidade(int idCidade) {
        this.idCidade = idCidade;
    }

   public String toString() {
        return this.NomeBairro;
   }
}

