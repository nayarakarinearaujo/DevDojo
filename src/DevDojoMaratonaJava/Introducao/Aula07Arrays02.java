package DevDojoMaratonaJava.Introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        //byte, short, int,long, float, e double valor 0
        //char, 'u000/' ''
        //boolean false
        //String null
        //Se alterar não vai rodar

        String[] nomes = new String[3]; //Usar apenas quando for criar um array

        nomes[0] = "Nayara";
        nomes[1] = "Adriana";
        nomes[2] = "Mariana";

        for (int i = 0; i < 3; i++) {
            System.out.println(nomes[i]);
        }
    }
}
