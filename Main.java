import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int N = 153 ;
      String armstrongNumberOrNot = armstrongNumber(N) ;
        System.out.println(armstrongNumberOrNot);
      }

    public static String armstrongNumber(int N) {
        int cloneOfN = N ;
        int sum = 0 ;
        while (N != 0){
            int digit = N % 10 ;
            sum = (int) (sum + Math.pow(digit,3));
            N = N / 10;
        }

        if (sum == cloneOfN){
            return "Yes" ;
        }else {
            return "No" ;
        }
    }
}


