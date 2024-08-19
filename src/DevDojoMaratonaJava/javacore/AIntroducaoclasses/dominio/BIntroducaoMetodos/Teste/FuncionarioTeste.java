package DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.Teste;

import DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(); // Use nome de variável em minúscula

        funcionario.setNome("Nayara");
        funcionario.setIdade(31);
        funcionario.setSalario(new double[]{2700, 2600, 2650});
        funcionario.imprimirMediaSalario();
        System.out.println("Média " + funcionario.getMediaSalario());
        funcionario.calcularMediaSalario();
    }
}
