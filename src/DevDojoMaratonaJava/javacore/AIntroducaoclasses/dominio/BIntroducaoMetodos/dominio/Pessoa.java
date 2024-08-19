package DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio;

public class Pessoa {

    //Modificador de acesso público
    //public String nome;
    //public int idade;

    //Modificador de acesso privado
    //Esses atributos só vai poder ser acessado pelo objeto

    private String nome;
    private int idade;

    public  void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    //Quando tem atributos privados só conseguimos acessar com um método publico

    //Setters: São métodos que permitem modificar (ou definir) o valor de um atributo privado de uma classe.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Idade inválida");
            return;
        }
        this.idade = idade;
    }

    //Getters: São métodos que permitem acessar (ou obter) o valor de um atributo privado de uma classe.
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }
}
