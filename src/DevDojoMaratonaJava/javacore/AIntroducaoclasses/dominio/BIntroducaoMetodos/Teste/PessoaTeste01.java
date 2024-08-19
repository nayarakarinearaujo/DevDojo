package DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.Teste;

import DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nayara");
        pessoa.setIdade(31);

        pessoa.imprime();

// Não é uma boa prática:
//        System.out.println(pessoa.getNome());
//        System.out.println(pessoa.getIdade());
    }
}
