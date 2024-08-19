package DevDojoMaratonaJava.Introducao;


public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        //Doar se salario for maior que 5000.
        double salario = 5000;
        String mensagemDoar = "Eu vou doar 500.";
        String mensagemNaoDoar = "Ainda não tenho condições de doar, mas vou ter.";

        //Sem operador ternário
//        String resultado;
//
//        if (salario > 5000) {
//            resultado = mensagemDoar;1
//        } else {
//            resultado = mensagemNaoDoar;
//        }
//        System.out.println(resultado);



        //Com Operador Ternário
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);



        // Mesma solução com operador ternário, porém mais simples
        //double salario = 5000;
//        String resultado = salario > 5000 ? "Eu vou doar 500" : "Ainda não tenho condições de doar, mas vou ter";
//        System.out.println(resultado);
    }
}
