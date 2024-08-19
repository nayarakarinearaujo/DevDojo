package DevDojoMaratonaJava.Introducao;

public class Aula02TiposPrimitivosStrings {

    //Atalho psvm + tab
    public static <bollean> void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        // [todos são palavras reservadas e precisam ser escritos com letra minúsculas]

        //int: para números inteiros
        //double: para números quebrados
        //String: diferente do char não tem limite de frase

        int idade = (int) 100000000000L;
        long numeroGrande = (long) 155.23;
        double salarioDouble= 2000.80;
        float salarioFloat= 2500.80F;
        byte idadeByte= -127;
        short idadeHort= 32000;
        boolean verdadeiro = true;
        boolean falso = false;


        System.out.println("A idade é " + idade + "anos");
        System.out.println(falso);
        System.out.println(numeroGrande);

        //String
        char caractere = 'N';
        String nome= "Nayara";

        System.out.println(nome);

        //Para concatenar
        System.out.println("Meu nome é " + nome);
        System.out.println("char " + caractere);

    }
}
