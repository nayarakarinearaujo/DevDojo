package DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.Teste;

import DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {

        //SEMPRE O OBJETO QUEM VAI EXECUTAR NUNCA A VARIÁVEL DE REFERÊNCIA

        //Variável de Referência:
        //Aqui, estudante01 é a variável de referência
        //que aponta para o objeto Estudante criado com o new Estudante().
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        //Objeto: É a instância real da classe que contém dados e métodos.
        // O objeto é o que executa as ações (ou métodos) definidos pela classe.

        //Nesse caso, o objeto Estudante apontado por estudante01 está
        // executando a operação de atribuição ao atributo nome, idade e sexo.
        estudante01.nome = "Nayara";
        estudante01.idade = 31;
        estudante01.sexo = 'F';

        estudante02.nome = "Junior";
        estudante02.idade = 33;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();


    }
}
