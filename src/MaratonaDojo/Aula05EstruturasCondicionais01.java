package MaratonaDojo;

//Estruturas condicionais if e else

public class Aula05EstruturasCondicionais01 {
    public static <isNaoAutorizado> void main(String[] args) {
        int idade = 18;
        boolean isAutorizado = idade >= 18;


        //Else não precisa de condição se não foi executado o if ele cai no else
        //Não pode ter else sem o if

        if (isAutorizado) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não altorizado a comprar bebida alcólica");
        }

        //Operador de negação sem usar o else !
        //if (!isAutorizado){
        //     System.out.println("Não altorizado a comprar bebida alcólica");
        //}


        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }
}