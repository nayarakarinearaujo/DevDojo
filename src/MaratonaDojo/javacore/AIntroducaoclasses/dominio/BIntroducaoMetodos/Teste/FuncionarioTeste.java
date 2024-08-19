package MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.Teste;

import MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.Funcionario;
import MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.ImpressoraFuncionario;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); // Use nome de variável em minúscula
        ImpressoraFuncionario impressora = new ImpressoraFuncionario();

        funcionario.setNome("Nayara");
        funcionario.setIdade(31);
        funcionario.setSalario(new double[] {2700, 2600, 2650});

        funcionario.calcularMediaSalario();
    }
}
