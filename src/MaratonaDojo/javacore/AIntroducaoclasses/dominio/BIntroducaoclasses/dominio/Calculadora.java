package MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoclasses.dominio;

public class Calculadora {
    //Método é criado na classe

    //Nesse método ele vai ser executado mas não vai retornar nada
    public void somaDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros() {
        System.out.println(21 - 2);
    }

    //Passagem de parâmetros nos métodos
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
}


