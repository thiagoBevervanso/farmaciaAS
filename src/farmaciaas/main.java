package farmaciaas;

import util.Input;


public class main {


    public static void main(String[] args) {
        menuPrincipal();
    }
    
    public static void menuPrincipal(){
        int opcao = 1;
        do{
            System.out.println("----Menu Principal----");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Exibir Dados");
            System.out.println("3 - Realizar Venda");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = Input.nextInt();

            switch (opcao) {
                case 0 -> System.out.println("Saindo...");
                case 1 -> menuCadastro();
                
                case 2 -> menuExibir();
                default -> System.out.println("Tente novamente");
            }

        }while(opcao != 0);

    }
    
    private static void menuCadastro(){
        int opcao = 1;
        do{
            System.out.println("----Menu Cadastro----");
            System.out.println("1 - Cadastrar Cliente");
            System.out.println("2 - Cadastrar Funcionario");
            System.out.println("3 - Cadastrar Produto");
            System.out.println("0 - Sair");
            System.out.print("opcao: ");
            opcao = Input.nextInt();
/*
            switch (opcao) {
                case 0 -> System.out.println("Saindo...");
                case 1 -> CadastroCliente.cadastrarCliente();
                case 2 -> CadastroVendedor.cadastrarVendedor();
                case 3 -> CadastroGerente.cadastrarGerente();
                default -> System.out.println("Tente novamente");
            }
*/
        }while(opcao != 0);
    }
    
    private static void menuExibir(){
        int opcao = 1;
        do{
            System.out.println("----Menu Exibir----");
            System.out.println("1 - Exibir Clientes");
            System.out.println("2 - Exibir Funcionario");
            System.out.println("3 - Exibir Produtos");
            System.out.println("3 - Exibir Vendas");
            System.out.println("0 - Sair");
            System.out.print("Opcao: ");
            opcao = Input.nextInt();
/*
            switch (opcao) {
                case 0 -> System.out.println("Saindo...");
                case 1 -> CadastroCliente.exibir();
                case 2 -> CadastroVendedor.exibir();
                case 3 -> CadastroGerente.exibir();
                default -> System.out.println("Tente novamente");
            }
*/
        }while(opcao != 0);
    }
    
}
