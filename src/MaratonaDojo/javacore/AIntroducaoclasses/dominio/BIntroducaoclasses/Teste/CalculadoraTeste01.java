package MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoclasses.Teste;

import MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoclasses.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {

        //Método é executado no objeto
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora teste 1:");
        calculadora.somaDoisNumeros();
        System.out.println("Calculadora teste 2:");
        calculadora.subtraiDoisNumeros();
    }
}
