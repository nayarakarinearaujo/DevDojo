package MaratonaDojo.Introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
        //Imprima o dia da semana considerando o 1 como domingo, com if ficaria muito grande o código
        //Usaremos o Switch

        byte dia = 4;

        //Só pode colocar as seguintes dados no switch:
        //cha, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;

            //Sempre colocar uma opção padrão para caso for inválido, mais comum colocar no final do case.
            default:
                System.out.println("Opção inválida!");
                break;
        }


        char sexo = 'F'; // Se declarar com áspas duplas todos precisam estar igual
        switch (sexo) {
            case 'M', 'm':
                System.out.println("Homem");
                break;
            case 'F', 'f':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}

//--------------------------------------------------------------------------------------------

// Pedindo para o usuário digitar as informações:

//Essa é outra forma de fazer

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Digite um número de 1 a 7 para saber o dia da semana: ");
//        byte dia = scanner.nextByte();
//
//        switch (dia) {
//            case 1:
//                System.out.println("Domingo");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            case 7:
//                System.out.println("Sábado");
//                break;
//            default:
//                System.out.println("Opção inválida!");
//                break;
//        }
//-----------------------------------------------------------------------------------------

//Essa é outra forma de fazer:

//        System.out.println("Digite F para Feminino e M para Masculino: ");
//        char sexo = scanner.next().charAt(0);
//
//        switch (sexo) {
//            case 'M', 'm':
//                System.out.println("Homem");
//                break;
//            case 'F', 'f':
//                System.out.println("Mulher");
//                break;
//            default:
//                System.out.println("Inválido");
//                break;
//        }
//
//    }
//}
