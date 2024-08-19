package DevDojoMaratonaJava.Introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {

        //Seria arrays lincados
        //1, 2, 3, 4 Meses
        //31, 28, 31, 30 dias

        int[][] dias = new int[3][3];
        dias[0][0] = 31;
        dias[0][1] = 30;
        dias[0][2] = 29;

        dias[1][0] = 31;
        dias[1][1] = 30;
        dias[1][2] = 29;

        for(int i = 0; i < dias.length; ++i){
            for (int j = 0; j < dias[0].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

    }
}
