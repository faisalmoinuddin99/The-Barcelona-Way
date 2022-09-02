import java.util.Scanner;

public class Main {

    static int counter = 0 ;
    public static void main(String[] args) {
        //f() ; // function call
        printName(5) ;
    }
    static void f(){

        // Base condition
        if(counter == 3){
            return ; // backtrack
        }
        System.out.print(counter + " ");
        counter++ ;
        f() ; // recursive call
    }
   static void printName(int N){
        if(counter == N){
            return ;
        }
        System.out.println("faisal " + counter);
        counter++ ;
        printName(N);
    }
}
/* OUTPUT:
        faisal 0
        faisal 1
        faisal 2
        faisal 3
        faisal 4
 */

