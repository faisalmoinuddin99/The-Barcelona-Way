import java.util.Scanner;

public class Main {

    static int counter = 0 ;
    public static void main(String[] args) {
        f() ; // function call
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

}
// OUTPUT: 0 1 2

