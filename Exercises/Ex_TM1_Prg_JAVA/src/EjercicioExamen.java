public class EjercicioExamen {
    public static void main(String[] args) {
        // int i=1;
        // int j=1;
        // int k=1;

        // while (i<=2) {
        //     System.out.println(i);
        //     i++;
        // }while (j<=3) {
        //     System.out.println(j);
        //     j++;
        // }while (k<=4) {
        //     System.out.println(k);
        //     k++;
        // }

        //ej 5_______________________________________

        for (int i = 1 ; i <= 4; i++ ){
            for (int j = 1 ; j <= 3; j++ ){
                for (int k = 4 ; k >= 1; k-- ){
                    System.out.print("@");
                    System.out.println(" ");
                }
            }
            System.out.println(" ");
        }


    }
}
