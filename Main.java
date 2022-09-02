import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print numbers from 1 to N without the help of loops.
        printNumber(10);
    }
   static  public void  printNumber(int N){

       if(N == 0) return;
       printNumber(N - 1);
       System.out.print(N + " ");
    }
}

