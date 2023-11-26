package cadastro;

import modelo.Cliente;
import modelo.Funcionario;
import modelo.Medicamento;
import modelo.MedicamentoControlado;
import modelo.MedicamentoInjetavel;
import modelo.Pessoa;
import modelo.Produto;
import modelo.Venda;


public class UtilidadesCadastro {
    
    protected static void setarDadosPessoa(Pessoa pe){
        System.out.println("Codigo: ");
        pe.setCodigo(util.Input.nextInt());
        System.out.println("Nome: ");
        pe.setNome(util.Input.nextLine());
        System.out.println("CPF: ");
        pe.setCpf(util.Input.nextLine());
        System.out.println("Data de Nascimento");
        pe.setDataNascimento(util.Input.nextLocalDate());
    }
    
    protected static  void setarDadosFuncionario(Funcionario fu){
        setarDadosPessoa(fu);
        System.out.println("CTPS: ");
        fu.setCtps(util.Input.nextLine());
    }
    
    protected static void setarDadosProduto(Produto prod){
        System.out.println("Codigo: ");
        prod.setCodigo(util.Input.nextInt());
        System.out.println("Descricao: ");
        prod.setDescricao(util.Input.nextLine());
        System.out.println("Marca: ");
        prod.setMarca(util.Input.nextLine());
        System.out.println("Lote: ");
        prod.setLote(util.Input.nextLine());
        System.out.println("Data de Fabricacao: ");
        prod.setDataFabricacao(util.Input.nextLocalDate());
        System.out.println("Codigo de Barras: ");
        prod.setCodigoBarras(util.Input.nextLine());
        System.out.println("Valor: ");
        prod.setValor(util.Input.nextDouble());
    }
    
    protected static void setarDadosMedicamento(Medicamento me){
        setarDadosProduto(me);
        System.out.println("Numero Registro Anvisa: ");
        me.setNumRegistroAnvisa(util.Input.nextInt());
        System.out.println("Composicao: ");
        me.setComposicao(util.Input.nextLine());
        System.out.println("Dosagem: ");
        me.setDosagem(util.Input.nextDouble());
    }
    
    protected static void setarDadosMedicamentoControlado(MedicamentoControlado medC){
        setarDadosMedicamento(medC);
        System.out.println("CRM Medico: ");
        medC.setCrmMedico(util.Input.nextLine());
        System.out.println("CPF Cliente: ");
        medC.setCpfCliente(util.Input.nextLine());
    }
    
    protected static void setarDadosMedicamentoInjetavel(MedicamentoInjetavel medI){
        setarDadosMedicamentoInjetavel(medI);
        System.out.println("Funcionario Resposavel: ");
        medI.setFuncionarioResposavel(util.Input.nextLine());
        System.out.println("CPF Cliente: ");
        medI.setCpfCliente(util.Input.nextLine());
    }
    
    protected static void setarDadosVenda(Venda ven){
        System.out.println("Codigo da Venda: ");
        ven.setCodigo(util.Input.nextInt());
        System.out.println("Funcionario: ");
        //ven.setFuncionario(util.Input.getTeclado());
        System.out.println("Cliente: ");
        //ven.setCliente(util.Input.getTeclado());
        System.out.println("Data: ");
        ven.setData(util.Input.nextLocalDate());
        System.out.println("Valor Produtos: ");
        ven.setValorProdutos(util.Input.nextDouble());
        System.out.println("Desconto: ");
        ven.setDescontos(util.Input.nextDouble());
        System.out.println("Valor Total: ");
        ven.setValorTotal(util.Input.nextDouble());
        System.out.println("Itens da Venda: ");
        //ven.setItens(util.Input.getTeclado());
    }
    
}
