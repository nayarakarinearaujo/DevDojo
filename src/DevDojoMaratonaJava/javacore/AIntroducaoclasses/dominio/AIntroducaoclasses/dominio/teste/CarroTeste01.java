package DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.AIntroducaoclasses.dominio.teste;

import DevDojoMaratonaJava.javacore.AIntroducaoclasses.dominio.AIntroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        //Inicializando objetos
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        //Inicializando valores do primeiro objeto
        carro2.nome = "Uno";
        carro2.modelo = "Vivace";
        carro2.ano = 2015;

        //Inicializando valores do segundo objeto
        carro1.nome = "Palio";
        carro1.modelo = "Fire";
        carro1.ano = 2016;

        //Para fazer carro2 receber os mesmos atributos de carro1
        carro1 = carro2;

        //Imprimindo valores dos objetos
        System.out.println("\nPrimeiro carro: " + carro1.nome + ", modelo: " + carro1.modelo + ", ano de fabricação: " + carro1.ano);
        System.out.println("-----------------------------------------");
        System.out.println("Segundo carro: " + carro2.nome + ", modelo: " + carro2.modelo + ", ano de fabricação: " + carro2.ano);


    }
}
