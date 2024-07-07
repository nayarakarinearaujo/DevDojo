package MaratonaDojo.Introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {

        int[] numeros = new int[3];
        int[] numero2 = {1, 2, 3, 4};
        int[] numero3 = new int[]{5, 4, 3, 2, 1};

        for (int i = 0; i < numero3.length; i++) {
            System.out.println(numero3[i]);
        }

        for(int num : numero3) {
            System.out.println(num);
        }
    }
}
