package MaratonaDojo.Introducao;

public class Aula06EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Exercício:
        //Imprima todos dos números pares até 1000000

        //Explicação: i += 2 : Ele vai atribuir ou contar de 2 em 2 até o valor i.
        //Para número impares substituir o 0 por 1

        //1 - Forma de resolver.
//        for (int i = 0; i <= 1000000; i += 2) {
//            System.out.println(i);
//        }

        //2 - Forma de resolver.
        //Melhor jeito: Pois mesmo que trocar o valor inicial de i sendo 0, trocar para 1 ele vai contar
        //e imprimir apenas os valores pares.
        for (int i = 0; i <= 1000000; i ++) {
            if (i % 2 == 0){
                System.out.println(i);

            }
        }
    }
}
