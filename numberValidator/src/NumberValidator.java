import java.util.ArrayList;

/**
 * Created by Michał on 30.10.2017.
 */
public class NumberValidator {


        public static boolean validPhoneNumber(String phoneNumber) {
            if( (phoneNumber.charAt(5) != ' ') || (phoneNumber.charAt(9) != '-' || phoneNumber.length() > 14)) return false;

            ArrayList<Character> charsToValid = new ArrayList<>();

            for(int i = 33 ; i < 127 ; i++){

                charsToValid.add(new Character((char) i));

            }


            for(int i = 48 ; i < 58 ; i++) {
                charsToValid.remove(new Character((char) i));

            }

            charsToValid.remove(new Character('('));
            charsToValid.remove(new Character(')'));
            charsToValid.remove(new Character('-'));

            for(int i = 0; i < phoneNumber.length();i++){
                for(int j = 0; j < charsToValid.size();j++)
                    if(phoneNumber.charAt(i) == charsToValid.get(j)) return false;
                //System.out.println("phone char :" + phoneNumber.charAt(i) + " valid char : "+charsToValid.get(i));
            }


            //System.out.print(charsToValid.toString());

            return true;
        }


        public static  void main( String[] args){


            NumberValidator v = new NumberValidator();

            System.out.print(v.validPhoneNumber("(123) 456-78f0"));



        }

}
