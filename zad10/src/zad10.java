import sun.nio.cs.Surrogate;

import java.util.Random;

/**
 * Created by Michał on 19.10.2017.
 */
public class zad10 {

    public static long generatorLong(){
        Random generator = new Random();
        return generator.nextLong();
    }

    public static String to36Base(Long var){
        
        String retStringVar = new String();

        while(var.intValue() != 0){
           long tmp = Math.floorMod(var,36);
            System.out.println(tmp);


            if( tmp < 9) retStringVar += tmp;
           else retStringVar += (char) (tmp + 87);

           var /= 36;

           System.out.println("przeksztalcona wartosc: " + retStringVar);


        }



        return retStringVar;


    }

    public static void main(String args[]){

        Long var = generatorLong();

        System.out.print("dla wartosci " + var +" wynik to "+to36Base(var));



    }

}
