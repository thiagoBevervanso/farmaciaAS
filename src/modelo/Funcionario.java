package modelo;

import java.time.LocalDate;


public class Funcionario extends Pessoa{
    protected String ctps;

    public Funcionario() {
    }
    
    public Funcionario(String ctps, int codigo, String nome, String cpf, LocalDate dataNascimento) {
        super(codigo, nome, cpf, dataNascimento);
        this.ctps = ctps;
    }

    public Funcionario(String ctps) {
        this.ctps = ctps;
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public void exibirFuncionario() {
        System.out.println("ctps: "+ ctps); 
    }
    
}
