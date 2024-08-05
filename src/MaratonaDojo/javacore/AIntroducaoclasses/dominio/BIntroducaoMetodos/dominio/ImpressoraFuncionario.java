package MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio;

public class ImpressoraFuncionario {

    public void imprime(Funcionario funcionario) { // Corrigido para receber o objeto Funcionario

        System.out.println("---------------");
        System.out.println("Nome do Funcionário: " + funcionario.nome);
        System.out.println("Idade: " + funcionario.idade);
        System.out.println("Salário do Mês 06/24: " + funcionario.salario[0]);
        System.out.println("Salário do Mês 07/24: " + funcionario.salario[1]);
        System.out.println("Salário do Mês 08/24: " + funcionario.salario[2]);
        System.out.println("A média do salário desses 3 meses: " + funcionario.mediaSalario);
        System.out.println("---------------");
    }
}
