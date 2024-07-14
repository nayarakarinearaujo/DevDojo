package MaratonaDojo.javacore.AIntroducaoclasses.dominio.AIntroducaoclasses.dominio.teste;

import MaratonaDojo.javacore.AIntroducaoclasses.dominio.AIntroducaoclasses.dominio.Professor;

public class ProfessorTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Mestre Kami";
        professor.idade = 39;
        professor.sexo = 'M';

        System.out.println("Nome do professor: " + professor.nome + ", Idade: " + professor.idade + ", Sexo: " + professor.sexo);

    }
}
