package modelo;

import java.time.LocalDate;


public class Cliente extends Pessoa{
    protected String email;

    public Cliente() {
    }

    public Cliente(String email, int codigo, String nome, String cpf, LocalDate dataNascimento) {
        super(codigo, nome, cpf, dataNascimento);
        this.email = email;
    }

    public Cliente(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void exibirCliente() {
        System.out.println("E-mail: " + email);
    }
    
    
}
