package POO;

import POO.empresa.Funcionarios;

public class FolhaDePagamento {
    public static void main(String[] args){
        Funcionarios funcionario1 = new Funcionarios();
        funcionario1.nome = "João Silva";
       // funcionario1.cargo= "Desenvolvedor"; é importante notar que esses atributos que sao privados n aparecem como opcao para usa-los . 
        //funcionario1.salario = 5000.00; 
        System.out.println("Nome do Funcionário: " + funcionario1.nome);
    }
}
