package MaratonaDojo.javacore.introducaoclasses.teste;

import MaratonaDojo.javacore.introducaoclasses.dominio.Estudante;

public class PessoaTeste01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
