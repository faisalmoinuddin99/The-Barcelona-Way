import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 123 ;
        int num = n ;
        int reverse = 0 ;

        while(n != 0){
            int digit = n % 10 ;
            reverse = reverse * 10 + digit ;
            n = n / 10 ;
        }
        System.out.println(num + " " +reverse); // 123 321
    }
}
