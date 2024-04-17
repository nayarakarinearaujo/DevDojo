package MaratonaDojo;

public class Aula07Arrays02a {
    public static void main(String[] args) {

//        String[] nomes = new String[3];
//
//        nomes[0] = "Fernanda";
//        nomes[1] = "Thais";
//        nomes[2] = "Nayara";
//
//        for (int i = 0; i < 3 ; i++) {
//            System.out.println(nomes[i]);
//
//        }

        //Outra forma de fazer:

        String[] nomes = new String[3];

        nomes[0] = "Fernanda";
        nomes[1] = "Thais";
        nomes[2] = "Nayara";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);

        }
    }
}

