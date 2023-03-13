import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a ordem da matriz? ");
        int n = scanner.nextInt();

        double[][] matriz = new double[n][n];

        System.out.println("Digite os valores da matriz: ");

        //usando os dois for assim estou varrendo toda a matriz posicao por posicao
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = scanner.nextDouble();


            }
        }

        double soma = 0.0;
        // varrendo so a diagonal da matriz
        for (int i = 0; i < n; i++) {
            soma = soma + matriz[i][i];
        }

        System.out.printf("Soma da diagonal principal= %.1f%n", soma);
    }
}




