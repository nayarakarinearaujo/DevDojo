package DevDojoMaratonaJava.Introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && idade < 18 categoria juvenil
        //idade >= 18 categoria adulto

        int idade = 18;
        String categoria;

//        if (idade < 15){
//            System.out.println("Categoria Infantil");
//        }else if(idade >= 15 && idade < 18){
//            System.out.println("Categoria Juvenil");
//        }else{
//            //Não precisa colocar a função quando terminar a comparação
//            System.out.println("Categoria Adulto");
//        }


        //Para simplificar o código e declarar categoria com variável:

        if (idade < 15) {
            categoria = "Categoria Infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria Juvenil";
        } else {
            //Não precisa colocar a função quando terminar a comparação
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }
}
