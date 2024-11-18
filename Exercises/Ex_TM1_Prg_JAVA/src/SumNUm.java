// import java.util.Arrays;
import java.util.Scanner;

public class SumNUm {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

    // Suma una serie de números de entrada hasta el 0 ?  suma numeros hasta q pongas 0 para salir del bucle
        System.out.print("introduce numeros y se irán sumando , si pones 0 sales: ");
        
        
        while (true){
            int n_User = Integer.valueOf(sc.nextLine());
            if (n_User > 0 && n_User < 0){
                n_User++;
            }else if (n_User == 0 ){
                break;
            }
            System.out.println(n_User);
        }
        sc.close();

    }
}
