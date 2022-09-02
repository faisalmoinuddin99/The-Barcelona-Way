import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N = 6;
        boolean ans = isPrime(N);
//        System.out.println(ans );

        if (ans) {
            System.out.println("yes");
        } else {
            System.out.println("No");
        }
    }

    static boolean isPrime(int N) {
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

}


