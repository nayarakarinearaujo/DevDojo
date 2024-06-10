package MaratonaDojo;

public class Aula04OperadoresLogicos {

    public static void main(String[] args) {
        //Operadores básicos:
        // + Soma
        // - Subtração
        // / Divisão
        // * Multiplicação

        //Nesse exemplo ele concatena
        int n1 = 15;
        int n2 = 35;
        System.out.println("valor"+n1+n2);

        //Se for antes de uma string ele vai calcular o valor da variável, e depois vai concatenar
        System.out.println(n1+n2+"valor"+n1+n2);

        //Para fazer a soma
        int num1 = 15;
        int num2 = 35;
        int resultadoSoma = num1+num2;
        System.out.println("Valor da soma é " + resultadoSoma);


        //Resultado de uma operação com dois números inteiros sempre será número inteiro
        int numero1= 10;
        int numero2= 20;
        double resultado = numero1 / numero2;
        System.out.println(resultado);

        //Nesse exemplo será double
        int nu1= 10;
        double nu2= 20;
        double res = nu1 / nu2;
        System.out.println(resultado);

        //Nesse exemplo fazendo o casting ele retorna o valor double
        //int numero1= 10;
        //int numero2= 20;
        //double resultado = numero1 / (double) numero2;
        //System.out.println(resultado);


        //Operador de resto %
        int resto = 20 % 7;
        System.out.println(resto);

        //________________________________________________

        //Operadores relacionais(sempre vão retorar valor booleano)
        // > : Utilizado quando desejamos verificar se uma variável é maior que outra.
        // >= : Utilizado quando desejamos verificar se uma variável é maior ou igual a outra
        // < : Utilizado quando desejamos verificar se uma variável é menor que outra.
        // <= : Utilizado quando desejamos verificar se uma variável é menor ou igual a outra.


        //Operadores de igualdade
        // == :Utilizado quando desejamos verificar se uma variável é igual a outra.
        //!= : Utilizado quando desejamos verificar se uma variável é diferente de outra.


        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("Dez é maior que vinte " + isDezMaiorQueVinte);
        System.out.println("Dez é menor que vinte " + isDezMenorQueVinte);
        System.out.println("Dez é igual a vinte " + isDezIgualVinte);
        System.out.println("Dez é igual a Dez " + isDezIgualDez);
        System.out.println("Dez é diferente de Dez " + isDezDiferenteDez);

        //________________________________________________


        //Operadores lógicos
        // (AND) && : Utilizado quando desejamos que as duas expressões sejam verdadeiras.
        // (OR) || : Utilizado quando precisamos que pelo meno um das expressões seja verdadeira, assim o restante será verdadeiro.


        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >=3381;
        System.out.println(isDentroDaLeiMenorQueTrinta + " Menor que 30.");
        System.out.println(isDentroDaLeiMaiorQueTrinta + " Maior que 30.");

        //________________________________________________



        //________________________________________________

        //Operadores de incremento e decremento
        //++ incrementa
        // -- decrementa


    }
}
