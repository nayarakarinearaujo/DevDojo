package MaratonaDojo.Introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {

        //Dado valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        //Condição valorParcela >= 1000

        //1 - forma de fazer

//        double valorTotal = 30000;
//        for (int parcela = 1; parcela <= valorTotal; parcela++) {
//            double valorParcela = valorTotal / parcela;
//            if (valorParcela >= 1000) {
//                System.out.println("Parcela " + parcela + " R$ " + valorParcela);
//            } else {
//                break;
//            }
//
//        }

        //2 - Forma de fazer, diminuindo os códigos

        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
