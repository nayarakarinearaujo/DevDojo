package MaratonaDojo.Introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        //Estruturas de repetição: while, do while, for

        int cont = 0;
        while (cont < 10) {

            // Três formas de fazer a mesma função:

            //Case 1 (esse vai imprimir de 0 até 9)
            //  System.out.println(cont);
            // cont = cont + 1;

            //Case 2 (esse vai ir até 9)
            //cont ++;

            //Case 3 (esse ele vai ir até 10) - Nesse caso ele imcrementa e depois imprimi
            System.out.println(++cont);
        }
        do {
            System.out.println("Dentro do while");
        } while (cont < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }

        //Explicação: é um loop "for" em Java que executa 10 iterações.
        // Ele inicializa uma variável i com o valor 0, continua
        // enquanto i for menor que 10 e, a cada iteração, incrementa i em 1.
        // Durante cada iteração, imprime "For " seguido pelo valor atual de i.

        //---------------------------------------------

        //Nesse caso ele incrementa depois imprimi ++i
        //Nesse caso ele imprimir e depois incrementa i++

        //---------------------------------------------

        // Case 4 Nesse exemplo ele vai imprimir de 5 em 5 até 20
        System.out.println("Contador de 5 em 5");
        int cont1 = 0;
        while (cont1 <= 20) {

            System.out.println(cont1);
            cont1 += 5;

            //---------------------------------------------

            // Case 5 Nesse exemplo ele vai imprimir de 1 até 20 apenas os números ìmpares
            //Aqui precisa ajustar o contador para começar no primeiro número ímpar que é 1 e colocar para incrementar 2
            //Por 2 para garantir que o próximo número seja ímpar. Isso ocorre porque números ímpares alternam a cada dois números por exemplo, 1, 3, 5, ...).
            System.out.println("Contador de 1 até 20 apenas os números ìmpares");
            int cont2 = 1;
            while (cont2 <= 20) {

                System.out.println(cont2);
                cont2 += 2;
            }
        }
    }
}