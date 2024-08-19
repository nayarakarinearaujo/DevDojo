package DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio;

public class Calculadora {
    //Método é criado na classe

    //Nesse método void ele vai ser executado mas não vai retornar nada para alguém que está chamando
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    //Passagem de parâmetros nos métodos
    //Deixar máximo de 2 argumentos por parâmetro
    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        }
        return num1 / num2;
    }

    //2° forma de fazer
    public double divideDoisNumeros02(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return num1 / num2;
        }
    }

    //3° forma de fazer
    public double divideDoisNumeros03(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        }
        return 0;
    }

    public void imprimeDivisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Não existe divisão por zero.");
            return;
        }
        System.out.println(num1 / num2);

    }

    public void alteraDoisNumeros(int num1, int num2) {
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do AlteraDoisNumeros");
        System.out.println("Num1 " + num1);
        System.out.println("Num2 " + num2);

        /*Nesse caso essa variável original nunca será alterada.
        No exemplo estamos fazendo uma cópia dos valores para
        a calculadoraTeste04 */
    }

    //Métodos pt 09 - Varargs
    public void somarArray (int[] numeros) {
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void sommaVarArgs(int... numeros) {
        int soma = 0;
        for(int num: numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}


