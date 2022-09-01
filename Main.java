import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ArrayList<Integer> l = new ArrayList<Integer>(100) ;

        int size = sc.nextInt() ;

        for (int i = 0; i < size; i++){
            l.add(sc.nextInt()) ;
        }
        System.out.println(l);
        System.out.println(l instanceof Serializable);
        System.out.println(l instanceof  Cloneable);
        System.out.println(l instanceof RandomAccess);
    }
}
