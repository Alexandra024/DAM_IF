import java.util.Scanner;
public class Sueldos {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

     
        int i=0,Sueldototal,Sueldomax,Sueldomin;

    
        while(i=0)
        {
        
            System.out.println("introduce tres numeros");
            int Sueldo=scanner.valueOf(nextLine());
            if(Sueldo=-1)
        {
            i=0;
        }
        else
        {

            if( Sueldo<Sueldomin || Sueldomin==0)
            {
                Sueldomin=Sueldo;
            }
            if( Sueldo>Sueldomax)
            {
                Sueldomax=Sueldo;
            }
            Sueldototal=Sueldototal+Sueldo;
            
        
        }
        }
        Sueldototal=Sueldototal/2;
        System.out.println("el sueldo maximo es"+Sueldomax+"el suedo minimo es"+Sueldomin+"el sueldo maximo es"+Sueldototal);
        scanner.close(); 
    
    
}
}