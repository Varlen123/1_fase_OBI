import java.util.Scanner;

public class dieta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); 
        int M = scanner.nextInt(); 

        int TC = 0;

        for (int i = 0; i < N; i++) {
            int P = scanner.nextInt(); 
            int G = scanner.nextInt(); 
            int C = scanner.nextInt(); 

            int calorias = P * 4 + G * 9 + C * 4;
            TC += calorias;
        }

        int caloriaRestante = M - TC;

        System.out.println(caloriaRestante);
    }
}