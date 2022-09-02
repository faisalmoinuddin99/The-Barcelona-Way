import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // optimized code for LCM and GCD
        Scanner sc = new Scanner(System.in) ;
        Long N1 = sc.nextLong();
        Long N2 = sc.nextLong();

    }

    static Long gcd(Long A, Long B){
        if(B == 0){
            return A ;
        }
        return gcd(B, A % B) ;
    }
    static Long[] gcdAndLcm(Long A, Long B){
        Long gcdANS = gcd(A, B) ;
        Long lcm = ((A * B) / gcdANS) ;

        return new Long[]{lcm, gcdANS};
    }
}


