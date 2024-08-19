package DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.Teste;

import DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {

        //Método é executado no objeto
        //Varivel de referencia = objeto
        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora teste 1:");
        calculadora.somaDoisNumeros();

        System.out.println("Calculadora teste 2:");
        calculadora.subtraiDoisNumeros();
    }
}
