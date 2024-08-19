package DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.Teste;

import DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 3);
        System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros02(10, 2));

        System.out.println(calculadora.divideDoisNumeros03(20, 2));

        System.out.println("------------------------------");

        /*Se o método não tem instruções para imprimir a divisão ou
         qualquer mensagem relacionada, essa chamada não produzirá
         nenhuma saída visível no console. Assim não será usado o
         System.out.println();
        */
        calculadora.imprimeDivisao(86, 0);
    }
}
