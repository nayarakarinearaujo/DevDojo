package MaratonaDojo;


public class Aula07Arrays01 {
    public static void main(String[] args) {

        //Arrays é considerado objeto na memória, e sempre inicia com 0.
        //Sempre iniciar com valor padrão no ex: [3]

        //Variável idade está fazendo referência ao objeto array que é inteiro de 3 posições.
        int [] idades = new int[3];
        idades[0] = 21;
        idades[1] = 18;
        idades[2] = 15;

        System.out.println(idades[2]);
    }
}
