package MaratonaDojo.Introducao;
/*
EXERCÍCIO:

Criar variáveis para os campos descritos abaixo entre<> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>, confirmo que recebi o salário de <salario>, na data <data>.
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {

        String nome = "Nayara";
        String endereco = "R: 9, N°400 - Parque Cidade de Campinas - Campinas - SP";
        double salario = 2000.00;
        String dataRecebimentoSalario = "05/06/2024";

        //Imprimindo mensagem com valores
        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario);

        //Outra forma de fazer é declarar uma variável e imprimir
        String relatorio = "Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de " + salario + ", na data " + dataRecebimentoSalario;
        System.out.println(relatorio);

    }

}
