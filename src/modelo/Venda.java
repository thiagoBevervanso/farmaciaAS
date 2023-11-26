package modelo;

import java.time.LocalDate;
import java.util.ArrayList;


public class Venda {
    protected int codigo;
    protected Funcionario funcionario;
    protected Cliente cliente;
    protected LocalDate data;
    protected Double valorProdutos;
    protected Double descontos;
    protected Double valorTotal;
    protected ArrayList itens;

    public Venda() {
    }

    public Venda(int codigo, Funcionario funcionario, Cliente cliente, LocalDate data, Double valorProdutos, Double descontos, Double valorTotal, ArrayList itens) {
        this.codigo = codigo;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.data = data;
        this.valorProdutos = valorProdutos;
        this.descontos = descontos;
        this.valorTotal = valorTotal;
        this.itens = itens;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public Double getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(Double valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    public Double getDescontos() {
        return descontos;
    }

    public void setDescontos(Double descontos) {
        this.descontos = descontos;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public ArrayList getItens() {
        return itens;
    }

    public void setItens(ArrayList itens) {
        this.itens = itens;
    }


    public String exibirVenda() {
        return "Venda{" + "codigo=" + codigo + ", funcionario=" + funcionario + ", cliente=" + cliente + ", data=" + data + ", valorProdutos=" + valorProdutos + ", descontos=" + descontos + ", valorTotal=" + valorTotal + ", itens=" + itens + '}';
    }
}
