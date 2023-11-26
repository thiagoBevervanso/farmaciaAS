package modelo;

import java.time.LocalDate;


public class Pessoa {
    protected int codigo;
    protected String nome;
    protected String cpf;
    protected LocalDate dataNascimento;

    public Pessoa() {
    }
    
    public Pessoa(int codigo, String nome, String cpf, LocalDate dataNascimento) {
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

 
    public String exibirPessoa() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + '}';
    }
    
    
}
