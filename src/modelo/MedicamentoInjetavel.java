package modelo;

import java.time.LocalDate;


public class MedicamentoInjetavel extends Medicamento{
    protected String funcionarioResposavel;
    protected String cpfCliente;

    public MedicamentoInjetavel() {
    }

    public MedicamentoInjetavel(String funcionarioResposavel, String cpfCliente, int numRegistroAnvisa, String composicao, Double dosagem, int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, Double valor) {
        super(numRegistroAnvisa, composicao, dosagem, codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor);
        this.funcionarioResposavel = funcionarioResposavel;
        this.cpfCliente = cpfCliente;
    }

    public String getFuncionarioResposavel() {
        return funcionarioResposavel;
    }

    public void setFuncionarioResposavel(String funcionarioResposavel) {
        this.funcionarioResposavel = funcionarioResposavel;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }
    
    public void exibirMedicamentoInjetavel() {
        System.out.println("funcionarioResposavel=" + funcionarioResposavel + ", cpfCliente=" + cpfCliente);
    }
    
}
