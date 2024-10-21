package MatrizesSoma;
import java.util.Scanner;
public class MatrizesGpt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;


        int[][] matriz = new int[2][2];

        for(int i =0 ; i< matriz.length; i++){
            for(int c = 0; c < matriz.length; c++){
                matriz[i][c] = sc.nextInt();
                soma = soma + matriz[i][c];
            }
        }
        for (int[] ints : matriz) {
            for (int c = 0; c < matriz.length; c++) {
                System.out.print(ints[c] + " ");
            }
            System.out.println();

        }

        System.out.println("a soma das matrizes é : " + soma);


    }
}
