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
public class BeansEstados {
    
    private int idEstado;
    private String NomeEstado;
    private int idBairros;
    
    public BeansEstados(){}
    
    public BeansEstados(int id, String NomeEstado) {
        this.idEstado = id;
        this.NomeEstado = NomeEstado;
    
}

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getNomeEstado() {
        return NomeEstado;
    }

    public void setNomeEstado(String NomeEstado) {
        this.NomeEstado = NomeEstado;
    }

    public int getIdBairros() {
        return idBairros;
    }

    public void setIdBairros(int idCidade) {
        this.idBairros = idCidade;
    }
    
    public String toString() {
        return this.NomeEstado;
    }

}