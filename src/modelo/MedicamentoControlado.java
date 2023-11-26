package modelo;

import java.time.LocalDate;


public class MedicamentoControlado extends Medicamento{
    protected String crmMedico;
    protected String cpfCliente;

    public MedicamentoControlado() {
    }

    public MedicamentoControlado(String crmMedico, String cpfCliente, int numRegistroAnvisa, String composicao, Double dosagem, int codigo, String descricao, String marca, String lote, LocalDate dataFabricacao, LocalDate dataVencimento, String codigoBarras, Double valor) {
        super(numRegistroAnvisa, composicao, dosagem, codigo, descricao, marca, lote, dataFabricacao, dataVencimento, codigoBarras, valor);
        this.crmMedico = crmMedico;
        this.cpfCliente = cpfCliente;
    }

    public String getCrmMedico() {
        return crmMedico;
    }

    public void setCrmMedico(String crmMedico) {
        this.crmMedico = crmMedico;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }


    public void exibirMedicamentoControlado() {
        System.out.println("crmMedico=" + crmMedico + ", cpfCliente=" + cpfCliente);
    }
}
