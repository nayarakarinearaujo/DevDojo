package MaratonaDojo;

public class Aula04OperadoresAtribuição03 {

    //Operadores de Atribuição
    // =  +=  -=  *=  /=  %=

    public static void main(String[] args) {
        double bonus = 1800;
        bonus = bonus + 1000;
        System.out.println(bonus);


        // Outra formar de fazer deixando o código mais limpo
        // Nesse caso ele recebe o valor que está declarado para ele na variável e soma mais mil.

        // bonus += 1000; //2800

        //Outros exemplos (Ambos estão corretos mas o segunda exemplo simplifica e abrevia o código.)
        bonus = bonus - 1000; // 1800
        bonus -= 1000; //1800

        bonus = bonus * 2; //3600
        bonus *= 2; //3600

        bonus = bonus / 2;
        bonus /= 2;

        bonus = bonus % 2;
        bonus %= 2;

        //Operadores Incremento ++ / Decremento --

        int contador = 0;
        //contador += 1; ou
        // contador = contador + 1;

        //Outra forma de fazer
        contador ++ ;
        System.out.println(contador);


        //Ex:

        // Nesse caso ele vai primeiro imprimir o valor e depois executar a conta
        contador ++;
        System.out.println(contador);

        System.out.println("---------------------");

        // Nesse caso ele soma antes de imprimir o contador, resultado: 1
        int contador2 = 0;
        ++ contador2;
        System.out.println(contador2);


        System.out.println("---------------------");
        //Nesse caso ele primeiro imprime o valor declarado no contador e depois ele faz a subtração, resultado: 0
        int contador3 = 0;
        contador3 --; //
        System.out.println(contador3);

        // Nesse caso ele subtrai antes de imprimir o contador, resultando: -1
        System.out.println("---------------------");
        int contador4 = 0;
        -- contador4;
        System.out.println(contador4);

    }
}
