import java.util.Scanner;

/**
 * Created by Michał on 19.10.2017.
 */
public class zad2 {

    public static int withModulo(int stVariable){

        return  ( stVariable %360  + 360) %360  ;
    }

    public static int withFloorMod(int stVariable){


        return Math.floorMod(stVariable, 360);
    }



    public static void main ( String args[]){

        Scanner ss = new Scanner(System.in);

        System.out.println(withModulo(ss.nextInt()));

        System.out.println(withFloorMod(ss.nextInt()));




    }
}
