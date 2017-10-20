import java.util.Scanner;

/**
 * Created by Michał on 20.10.2017.
 */
public class zad11 {

    public static void textWithUnicode(String var){


        for(int i = 0; i < var.length(); i++){

            if(var.charAt(i) > 127 ) {

                System.out.println("litera spoza zakresu ACII :" + var.charAt(i) + " unicode: "+var.codePointAt(i));
            }

        }



    }

    public static void main(String args[]){

        Scanner in = new Scanner(System.in);
        System.out.println("podaj wiersz tekstu");
        textWithUnicode(in.nextLine());




    }
}
