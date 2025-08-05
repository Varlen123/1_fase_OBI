import java.util.Scanner;

public class cafeteria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        Boolean possibilidade = false;
        if (100 <= C && C <= 500 && 0 <= A && A <= B && B <= C && 10 <= D && D <= 100) {
        
            for(int n = 0; n * D <= C; n++){
                int VC = n * D;
                int VL = C - VC;
                
                if( VL >= A && VL <= B){
                    possibilidade = true;
                    break;
                }
                
            }
            if(possibilidade){
                System.out.println("S");
            }else{
                System.out.println("N");
            }


      }  
    }
}
