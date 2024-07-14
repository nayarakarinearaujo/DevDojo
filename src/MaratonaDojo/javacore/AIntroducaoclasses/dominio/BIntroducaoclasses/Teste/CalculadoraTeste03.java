package MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoclasses.Teste;

import MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoclasses.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.divideDoisNumeros(20, 3);
        System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros02(10, 2));

        System.out.println(calculadora.divideDoisNumeros03(20, 2));

        System.out.println("------------------------------");

        calculadora.imprimeDivisao(86, 0);
    }
}
