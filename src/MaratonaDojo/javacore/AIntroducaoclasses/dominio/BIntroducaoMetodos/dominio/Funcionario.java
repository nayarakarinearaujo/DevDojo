package MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio;

/* Crie uma classe Funcionário com os seguintes atributos
    nome
    idade
    salario // três salários devem ser guardados

    Crie dois métodos
    1. Para imprimir os dados
    2. Para tirar a média dos salários e imprimir o resultado
**/

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salario = new double[3]; // Array para armazenar os salários
    private double mediaSalario;

    // Método para calcular a média dos salários
    public void calcularMediaSalario() {
        double soma = 0;
        for (double sal : salario) {
            soma += sal;
        }
        this.mediaSalario = soma / salario.length;  // Calcula a média e armazena no atributo da classe
    }

    // Método para imprimir os dados do funcionário
    public void imprimirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.print("Salários: ");
        for (double sal : salario) {
            System.out.print(sal + " ");
        }
        System.out.println();
    }

    // Método para imprimir a média dos salários
    public void imprimirMediaSalario() {
        calcularMediaSalario();  // Garante que a média seja recalculada antes de imprimir
        System.out.println("Média dos Salários: " + mediaSalario);
    }

    // Métodos de acesso (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalario() {
        return salario;
    }

    public void setSalario(double[] salario) {
        if (salario.length == 3) {
            this.salario = salario;
        } else {
            System.out.println("O array de salários deve ter exatamente 3 elementos.");
        }
    }

    public double getMediaSalario() {
        return mediaSalario;
    }

}
