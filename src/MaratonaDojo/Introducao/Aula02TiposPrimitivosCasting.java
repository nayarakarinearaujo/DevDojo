package MaratonaDojo.Introducao;

public class Aula02TiposPrimitivosCasting {

    //Atalho psvm + tab

    public static void main(String[] args) {

        //int, double, float, char, byte, short, long, boolean
        // [todos são palavras reservadas e precisam ser escritos com letra minúsculas]

        //int: para números inteiros
        //double: para números quebrados
        //String: diferente do char não tem limite de frase

        //Casting é forçar um valor 'long' entrar dentro do 'int'
        int idade = (int) 100000000000L;

        //Aqui ele está forçando um double entrar no long, o resultado ele ignora os números decimais
        long numeroGrande = (long) 155.23;

        //Variável que guarda valores decimais
        double salarioDouble= 2000.80;

        //Sempre que por declarar float precisa por o F
        float salarioFloat= 2500.80F;

        byte idadeByte= -127;
        short idadeHort= 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 65;

        String nome= "asfddasfsdfsdfsdf";
        System.out.println("A idade é " + idade + " anos");
        System.out.println(falso);
        System.out.println("char" + caractere);
        System.out.println(numeroGrande);
        System.out.println(salarioFloat);

    }
}
