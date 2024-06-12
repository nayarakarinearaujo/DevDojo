package MaratonaDojo;

public class Aula04OperadoresLogicosOr02 {
    public static void main(String[] args) {

        //Operadores lógicos
        //OR - Nesse caso basta uma das condições ser verdadeira pára o resultado ser verdadeiro

        double valorTotalContaCorente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlayStation = 500f;

        //Leitura: se o valor total da conta corrente for maior que o valor do playstation || (ou)
        // total da conta poupança for maior que o valor do playstation
        boolean isPlayStationCincoCompravel = valorTotalContaCorente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println("PlayStation cinco Comprável " + isPlayStationCincoCompravel);


    }
}
