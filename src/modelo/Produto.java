package modelo;

import java.time.LocalDate;


public class Produto {
    protected int codigo;
    protected String descricao;
    protected String marca;
    protected String lote;
    protected LocalDate dataFabricacao;
    protected LocalDate dataVencimento;
    protected String codigoBarras;
    protected Double valor;

    public Produto() {
    }
    
    public Produto(int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, Double valor) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.marca = marca;
        this.lote = lote;
        this.dataFabricacao = dataFabricacao;
        this.dataVencimento = dataVencimento;
        this.codigoBarras = codigoBarras;
        this.valor = valor;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(LocalDate dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }


    public void exibirProduto() {
        System.out.println(", descricao=" + descricao + ", marca=" + marca + ", lote=" + lote + ", dataFabricacao=" + dataFabricacao + ", dataVencimento=" + dataVencimento + ", codigoBarras=" + codigoBarras + ", valor=" + valor);
    }
    
}
