package MaratonaDojo.javacore.Aintroducaoclasses.teste;

import MaratonaDojo.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();

        estudante.nome = "Sanji";

        System.out.println(estudante.sexo);
        System.out.println(estudante.idade);
        System.out.println(estudante.nome);
    }
}
