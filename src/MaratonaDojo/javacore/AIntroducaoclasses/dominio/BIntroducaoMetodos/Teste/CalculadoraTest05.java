package MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.Teste;

import MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        //Quando usamos um array como argumento, precisamos criar o array explicitamente
        // e depois passá-lo ao método.
        int []numeros = {1, 2, 3, 4, 5};
        calculadora.somarArray(numeros);

        //Quando usamos varargs (...), podemos passar um número variável de argumentos para o método,
        // e o Java automaticamente os agrupa em um array.
        calculadora.sommaVarArgs(1, 2, 3, 4, 5, 6, 7);

    }
}
