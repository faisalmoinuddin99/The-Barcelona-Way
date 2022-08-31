public class Main {
    public static void main(String[] args) {
        int i,j,k=5, p= 0 ;

        for(i = 1; i <= 5; i++){
            for(j = 1; j < k; j++){
                System.out.print(" ");
            }
            k-- ;
            for (int s = 0 ; s < i+p ;s++){
                System.out.print(2 * s + 1);
            }
            System.out.println();
            p++ ;
        }

    }
}
/*
OUTPUT:

    1
   135
  13579
 135791113
1357911131517

 */