package modelo;

import java.time.LocalDate;


public class Medicamento extends Produto{
    protected int numRegistroAnvisa;
    protected String composicao;
    protected Double dosagem;

    public Medicamento() {
    }

    public Medicamento(int numRegistroAnvisa, String composicao, Double dosagem, int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, Double valor) {
        super(codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor);
        this.numRegistroAnvisa = numRegistroAnvisa;
        this.composicao = composicao;
        this.dosagem = dosagem;
    }

    public int getNumRegistroAnvisa() {
        return numRegistroAnvisa;
    }

    public void setNumRegistroAnvisa(int numRegistroAnvisa) {
        this.numRegistroAnvisa = numRegistroAnvisa;
    }

    public String getComposicao() {
        return composicao;
    }

    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    public Double getDosagem() {
        return dosagem;
    }

    public void setDosagem(Double dosagem) {
        this.dosagem = dosagem;
    }

    public void exibirMedicamento() {
        System.out.println("numRegistroAnvisa=" + numRegistroAnvisa + ", composicao=" + composicao + ", dosagem=" + dosagem);
    }
}
