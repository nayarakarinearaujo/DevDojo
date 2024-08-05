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

    public String nome;
    public int idade;
    public double[] salario = new double[3]; // Array para armazenar os salários
    public double mediaSalario;

    // Método para calcular a média dos salários
    public void calcularMediaSalario() {
        double soma = 0;
        for (double sal : salario) {
            soma += sal;
        }
        this.mediaSalario = soma / salario.length;  // Calcula a média e armazena no atributo da classe
    }
}


