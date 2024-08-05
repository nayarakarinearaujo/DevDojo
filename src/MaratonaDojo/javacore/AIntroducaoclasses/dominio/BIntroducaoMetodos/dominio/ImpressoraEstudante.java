package MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio;

public class ImpressoraEstudante {
    public void imprime (Estudante estudante){

        //NÃO PODE ALTERAR DADOS NO OBJETO DE REFERÊNCIA

        /*  A classe ImpressoraEstudante não deve alterar os dados da classe Estudante por algumas razões principais:
        Imutabilidade: Manter os dados do Estudante inalterados evita efeitos colaterais inesperados.
        Encapsulamento: Segue o princípio de que dados de um objeto devem ser modificados apenas dentro da própria classe.
        Responsabilidade Única: A classe ImpressoraEstudante deve se limitar a imprimir dados e não modificar o estado dos objetos.
        Boas Práticas de Projeto: Pode haver convenções ou requisitos específicos do projeto que definem que a classe deve ser somente para exibição.
        Esses princípios garantem um código mais organizado, seguro e fácil de manter.
         */

        System.out.println("---------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

    }
}
