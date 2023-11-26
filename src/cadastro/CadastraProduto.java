package cadastro;

import java.util.ArrayList;
import modelo.Produto;
import cadastro.UtilidadesCadastro;


public class CadastraProduto {
    private static ArrayList<Produto> produtos = new ArrayList<>();
    
    public static void cadastrarProduto(){
        Produto prod = new Produto();
        UtilidadesCadastro.setarDadosProduto(prod);
        produtos.add(prod);
    }
    
    public static void exibir(){
        for(Produto produtos : produtos){
            produtos.exibirProduto();
        }
    }
}
