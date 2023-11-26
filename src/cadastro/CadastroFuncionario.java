package cadastro;

import java.util.ArrayList;
import modelo.Funcionario;


public class CadastroFuncionario {
    
    private static ArrayList<Funcionario> funcionarios = new ArrayList<>();
    
    public static void cadastrarFuncionario(){
        Funcionario fu = new Funcionario();
        UtilidadesCadastro.setarDadosFuncionario(fu);
        funcionarios.add(fu);
    }
    
    public static void exibir(){
        for (Funcionario funcionarios : funcionarios){
            funcionarios.exibirFuncionario();
        }
    }
}
