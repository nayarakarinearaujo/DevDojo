package DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio;

//public: O modificador de acesso public significa que a classe Estudante pode ser acessada de qualquer lugar no código, desde que o pacote de importação esteja correto.
//class Estudante: Define a classe chamada Estudante.
public class Estudante {

    //Atributos da Classe:
    //public: Os atributos são declarados como public, o que significa que eles podem ser acessados diretamente de fora da classe.
    //String nome: Armazena o nome do estudante.
    //int idade: Armazena a idade do estudante.
    //char sexo: Armazena o sexo do estudante.

    public String nome;
    public int idade;
    public char sexo;

    //Método imprime():
    //public: O modificador de acesso public permite que o método imprime seja chamado de qualquer lugar.
    //void: O método não retorna nenhum valor (void significa que o método não tem um valor de retorno).
    //this: A palavra-chave this refere-se ao objeto atual. Ela é usada para acessar os atributos e métodos da instância atual da classe.
    // No método imprime(), this.nome, this.idade e this.sexo se referem aos valores dos atributos do objeto que chamou o método.
    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
