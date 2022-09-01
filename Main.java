import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int N1 = 14;
        int N2 = 8;
        int approach1 = findGCDApproach1(N1, N2);
        int approach2 = gcd(N1, N2) ;
//        System.out.println(approach1);
        System.out.println("GCD: "+approach2);

        int lcm = findLCM(N1, N2) ;
        System.out.println("LCM: "+ lcm);
    }

    // Tn: O(n)
    public static int findGCDApproach1(int num1, int num2) {
        int min = Math.min(num1, num2);
        int ans = 0;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                ans = i;
            }
        }
        return ans;
    }
    public static int findLCM(int num1, int num2){
        int gcd = findGCDApproach1(num1,num2) ;
        return (num1 * num2) / gcd;
    }
    // Tn: O(log_phi min(a,b)) where phi = 1.61
    public static int gcd(int num1, int num2) {
        if (num2 == 0){
            return num1 ;
        }
        return gcd(num2,num1 % num2) ;
    }
}


