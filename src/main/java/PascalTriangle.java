import java.util.Scanner;

/*
 * Enunciado: Crea una función que sea capaz de dibujar el "Triángulo de Pascal"
 * indicándole únicamente el tamaño del lado.
 *
 * - Aquí puedes ver rápidamente cómo se calcula el triángulo:
 *   https://commons.wikimedia.org/wiki/File:PascalTriangleAnimated2.gif
 */
public class PascalTriangle {
    public static void main(String args []){
        System.out.println("----********-Pascal's triangle challenge-********----");
        System.out.println("************----------------------------************");
        System.out.println("Enter the size of the triangle");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [][] triangle = new int [size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    triangle[i][j] = 1;
                } else {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }

    }
}
