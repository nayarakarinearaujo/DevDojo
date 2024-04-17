package MaratonaDojo;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {

        //Estruturas de repetição: while, do while, for

        int cont = 0;
        while (cont < 10) {

            // Três formas de fazer a mesma função:

            // 1 (esse vai ir até 9)
            //  System.out.println(cont);
            // cont = cont + 1;

            //2 (esse vai ir até 9)
            //cont ++;

            //3 (esse ele vai ir até 10)
            System.out.println(++cont);
        }
        do {
            System.out.println("Dentro do while");
        } while (cont < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }

        //Explicação:  é um loop "for" em Java que executa 10 iterações.
        // Ele inicializa uma variável i com o valor 0, continua
        // enquanto i for menor que 10 e, a cada iteração, incrementa i em 1.
        // Durante cada iteração, imprime "For " seguido pelo valor atual de i.
    }
}