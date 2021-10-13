/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;

/**
 *
 * @author Jhonny_Queillia
 */
public class ParcelamentoVenda {
    private Integer IdVenda;
    private String DataVenda;
    private Float ValorVenda;
    private Integer QtdeParcelas;
    private Float Juros;
    private Float TotalParcela;    
    private String Pesquisar;

    public Integer getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(Integer IdVenda) {
        this.IdVenda = IdVenda;
    }

    public String getDataVenda() {
        return DataVenda;
    }

    public void setDataVenda(String DataVenda) {
        this.DataVenda = DataVenda;
    }

    public Float getValorVenda() {
        return ValorVenda;
    }

    public void setValorVenda(Float ValorVenda) {
        this.ValorVenda = ValorVenda;
    }

    public Integer getQtdeParcelas() {
        return QtdeParcelas;
    }

    public void setQtdeParcelas(Integer QtdeParcelas) {
        this.QtdeParcelas = QtdeParcelas;
    }

    public Float getJuros() {
        return Juros;
    }

    public void setJuros(Float Juros) {
        this.Juros = Juros;
    }

    public Float getTotalParcela() {
        return TotalParcela;
    }

    public void setTotalParcela(Float TotalParcela) {
        this.TotalParcela = TotalParcela;
    }

    public String getPesquisar() {
        return Pesquisar;
    }

    public void setPesquisar(String Pesquisar) {
        this.Pesquisar = Pesquisar;
    }
    
}
