import java.util.Scanner;

/**
 * Created by Michał on 19.10.2017.
 */
public class zad1 {

    private static void displayInHexOx(Integer var){

        System.out.printf("%x, %o", var, var);


    }

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        displayInHexOx(in.nextInt());




    }
}
