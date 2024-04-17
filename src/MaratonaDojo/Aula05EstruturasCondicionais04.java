package MaratonaDojo;

//Exercício quanto tem que pagar na Holanda em 2020 baseado no salário atual

import java.util.Scanner;

//€ 34,712  9.70%
//€ 34,713  € 68,587   37,25%
//€ 68,588    49.58%
public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite seu salario Anual: ");
            double salarioanual = scanner.nextDouble();
            double valorImposto;
            if (salarioanual <= 34712) {
                valorImposto = salarioanual * 0.097;
            } else if (salarioanual > 34713 && salarioanual <= 68507) {
                valorImposto = salarioanual * 0.3735;
            } else {
                valorImposto = salarioanual * 0.4950;
            }
            System.out.println(" seu imposto anual é de: " + valorImposto);
        }
    }

