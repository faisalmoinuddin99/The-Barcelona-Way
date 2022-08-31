public class Main {
    public static void main(String[] args) {
        int k = 5, p = 0;
        int i ;
        for (i = 1; i <= 5; i++){
            // this will detect the spaces
            for(int j = 1; j < k; j++){
                System.out.print(" ");
            }
            k-- ;
            // logic to print odd number
            for(int s = 0 ; s < i + p; s++){
                System.out.print("*");
            }
            System.out.println();
            p++ ;
        }

    }
}
/*
OUTPUT:

    *
   ***
  *****
 *******
*********

 */