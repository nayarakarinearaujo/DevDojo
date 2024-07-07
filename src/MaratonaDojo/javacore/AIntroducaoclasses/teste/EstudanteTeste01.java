package MaratonaDojo.javacore.AIntroducaoclasses.teste;

import MaratonaDojo.javacore.AIntroducaoclasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        //Variável do tipo estudante  //Objeto do tipo estudante
        Estudante estudante = new Estudante();

        estudante.nome = "Nayara";
        estudante.idade = 31;
        estudante.sexo = 'F';

        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
    }
}