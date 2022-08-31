import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = -5555 ;
        String result = isPalindrome(N) ;
        System.out.println(result);
    }

    public static boolean isPositive(int number){
        return number >= 0;
    }
    public static String isPalindrome(int number){
       if (isPositive(number)) {
        int copiedNumber = number ;
        int reverse = 0 ;
        while(copiedNumber != 0){
            int digit = copiedNumber % 10 ;
            reverse = reverse * 10 + digit ;
            copiedNumber = copiedNumber / 10 ;
        }
        System.out.println(reverse);
        if (reverse == number) {
            return "Yes" ;
        }else {
            return "No" ;
        }
       }
       return "No" ;
    }
}
