package MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.Teste;

import MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.Estudante;
import MaratonaDojo.javacore.AIntroducaoclasses.dominio.BIntroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Nayara";
        estudante01.idade = 31;
        estudante01.sexo = 'F';

        estudante02.nome = "Junior";
        estudante02.idade = 33;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        /*Quando passa objetos como referencia, está passando
        está passando onde aquele objeto está guardado */
        //Podemos ter várias referencias para o mesmo objeto.
    }
}
