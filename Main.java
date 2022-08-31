import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 1234575565 ;

        int count = 0 ;

        // APPROACH 1 - Tn: O(n)
        while(N != 0){
            N = N / 10 ;
            count++ ;
        }
        System.out.println(count);


        // APPROACH 2 - Tn: O(1)
        int newN = 1234575565 ;
        String convertedN = String.valueOf(newN) ;
        System.out.println(convertedN.length());

        // APPROACH 3 - Tn: O(1)
        int approachThirdNumber = 123456 ;
        int digit = (int) Math.floor(Math.log10(approachThirdNumber) + 1);
        System.out.println(digit);
    }
}
