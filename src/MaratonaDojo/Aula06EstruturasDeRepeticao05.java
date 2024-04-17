package MaratonaDojo;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        //Dado valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        //Condição valorParcela >= 1000

        double valorTotal = 30000;
        for (int parcela = 0; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}


