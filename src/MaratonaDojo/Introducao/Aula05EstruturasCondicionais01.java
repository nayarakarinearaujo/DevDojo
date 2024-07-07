package MaratonaDojo.Introducao;

//Estruturas condicionais if e else

public class Aula05EstruturasCondicionais01 {

    public static <isNaoAutorizado> void main(String[] args) {

        //If obrigatoriamente precisa retornar resultado bolean
        //Else não precisa de condição se não foi executado o if ele cai no else
        //Não pode ter else sem o if

        //Exemplo 1°:
        int idade = 18;
        boolean isAutorizado = idade >= 18;

        if (isAutorizado) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não altorizado a comprar bebida alcólica");
        }

        System.out.println("--------------------------------------");

        //Exemplo 2°:
        int idade2 = 15;

        if (idade2 >= 18) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não altorizado a comprar bebida alcólica");
        }

        System.out.println("--------------------------------------");

        //Operador de negação sem usar o else !
        //Leitura: Se não autorizado a comprar bebida alcólica imprimir:
        //if (!isAutorizado){
        //     System.out.println("Não altorizado a comprar bebida alcólica");
        //}

        //Outro exemplo:
        //Leitura: Se autorizado for false imprimir:
        if (isAutorizado == false) {
            System.out.println("Não autortizado a comprar bebiba alcólica!");
        }

        System.out.println("--------------------------------------");

        //Não deve ser feito
        //Ineficiente e Verboroso: Comparar c == true é redundante porque c já é uma expressão booleana.

        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        //Melhor Prática: Use o valor booleano diretamente na condição do if.
        //Uma forma melhor de fazer
        boolean c1 = false;
        if (c1) {
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}