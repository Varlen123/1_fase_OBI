import java.util.Scanner;

public class festa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int E = scanner.nextInt();
        int S = scanner.nextInt();
        int L = scanner.nextInt();
        int DistanciaFinal;

        if (E >= 0 && E <= 1000 && S >= 0 && S <= 1000 && L >= 0 && L <= 1000 && E != S && E != L && S != L) {
 int distancia1 = Math.abs(E - S); 
    int distancia2 = Math.abs(S - L); 
        int distancia3 = Math.abs(L - E); 

            DistanciaFinal = distancia1 + distancia2 + distancia3;

            System.out.println( DistanciaFinal);
        }
    }
}