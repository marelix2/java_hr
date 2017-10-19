import java.math.BigInteger;

/**
 * Created by Michał on 19.10.2017.
 */
public class zad6 {

    public static void factorial(){

        BigInteger fact = BigInteger.valueOf(1);

        for(int i = 1; i <= 1000;i++) fact = fact.multiply(BigInteger.valueOf(i));

        System.out.print(fact);
    }



    public static void main(String args[]){

        factorial();


    }
}
