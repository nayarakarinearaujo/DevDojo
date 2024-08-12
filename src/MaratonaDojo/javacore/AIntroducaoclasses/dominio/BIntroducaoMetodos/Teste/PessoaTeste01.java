package MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.Teste;

import MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Nayara");
        pessoa.setIdade(31);

//        pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
