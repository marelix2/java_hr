/**
 * Created by Michał on 19.10.2017.
 */
public class zad3 {

    public static int withOper(int x, int y, int z){

        return x>y? x>z? x :z :y>z? y: z;
    }

    public static int withMathMax(int x,int y, int z){

        return Math.max(Math.max(x,y),z);
    }


    public static void main(String args[]){

        System.out.println(withOper(2,3,4));
        System.out.println(withMathMax(2,3,4));




    }
}
