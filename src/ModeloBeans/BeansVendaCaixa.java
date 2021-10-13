/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ModeloBeans;


public class BeansVendaCaixa {
    
    private Integer IdVenda;    
    private String Cliente;
    private Integer QtdeItens;
    private Integer IdProduto;
    private String Produto;
    private Integer QtdeProduto;
    private Float PrecoProduto;
    private Float TotalProduto;
    private String DataVenda;
    private Float ValorVenda;
    private String FormaPagto;
    private Integer ItemDeletado;
    private String Pesquisar;

    public Integer getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(Integer IdVenda) {
        this.IdVenda = IdVenda;
    }

    public String getCliente() {
        return Cliente;
    }

    public void setCliente(String Cliente) {
        this.Cliente = Cliente;
    }

    public String getProduto() {
        return Produto;
    }

    public void setProduto(String Produto) {
        this.Produto = Produto;
    }

    public Integer getQtdeProduto() {
        return QtdeProduto;
    }

    public void setQtdeProduto(Integer QtdeProduto) {
        this.QtdeProduto = QtdeProduto;
    }

    public Float getPrecoProduto() {
        return PrecoProduto;
    }

    public void setPrecoProduto(Float PrecoProduto) {
        this.PrecoProduto = PrecoProduto;
    }

    public Float getTotalProduto() {
        return TotalProduto;
    }

    public void setTotalProduto(Float TotalProduto) {
        this.TotalProduto = TotalProduto;
    }

    public String getPesquisar() {
        return Pesquisar;
    }

    public void setPesquisar(String Pesquisar) {
        this.Pesquisar = Pesquisar;
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

    public Integer getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(Integer IdProduto) {
        this.IdProduto = IdProduto;
    }

    public Integer getQtdeItens() {
        return QtdeItens;
    }

    public void setQtdeItens(Integer QtdeItens) {
        this.QtdeItens = QtdeItens;
    }

    public String getFormaPagto() {
        return FormaPagto;
    }

    public void setFormaPagto(String FormaPagto) {
        this.FormaPagto = FormaPagto;
    }

    public Integer getItemDeletado() {
        return ItemDeletado;
    }

    public void setItemDeletado(Integer ItemDeletado) {
        this.ItemDeletado = ItemDeletado;
    }

}