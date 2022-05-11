import java.util.Locale;
import java.util.Scanner;

public class LetterCapitalize {

    public static String LetterCapitalize (String text){

        text = text.substring(0,1).toUpperCase()+text.substring(1).toLowerCase();

        return text;

    }

    public static void main(String[] args) {

        Scanner scn= new Scanner(System.in);
        System.out.println(LetterCapitalize(scn.nextLine()));

    }

}
