package MaratonaDojo.javacore.Aintroducaoclasses.teste;

import MaratonaDojo.javacore.Aintroducaoclasses.dominio.Estudante;

import java.sql.SQLOutput;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante ();

        estudante.nome = "Sanji";
        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);

        System.out.println("-------------------");

        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.nome);
    }
}
