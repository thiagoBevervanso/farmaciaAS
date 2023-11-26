package cadastro;

import java.util.ArrayList;
import modelo.Cliente;
import cadastro.UtilidadesCadastro;


public class CadastroCliente {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    
    public static void cadastrarCliente(){
        Cliente cli = new Cliente();
        UtilidadesCadastro.setarDadosPessoa(cli);
        System.out.println("E-mail: ");
        cli.setEmail(util.Input.nextLine());
        clientes.add(cli);
    }

    public static void exibir(){
        for (Cliente clientes : clientes){
            clientes.exibirCliente();
        }
    }
    
}
