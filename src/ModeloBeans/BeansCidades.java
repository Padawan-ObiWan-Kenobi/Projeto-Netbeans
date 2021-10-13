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
public class BeansCidades {
    
    private int idCidade;
    private String NomeCidade;
    
    public BeansCidades(){}
    
    public BeansCidades(int id, String NomeCidade) {
        this.idCidade = id;
        this.NomeCidade = NomeCidade;
    
}

    public int getId() {
        return idCidade;
    }

    public void setId(int id) {
        this.idCidade = id;
    }

    public String getNomeCidade() {
        return NomeCidade;
    }

    public void setNomeCidade(String NomeCidade) {
        this.NomeCidade = NomeCidade;
    }
    
    public String toString() {
        return this.NomeCidade;
    }

    public int getIdCidades() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}