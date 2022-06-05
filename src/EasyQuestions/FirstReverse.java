package EasyQuestions;

import java.util.Scanner;

public class FirstReverse {

    public static String FirstReverse(String str){

        char [] character = str.toCharArray();
        String reverse = "";

        for (int i = str.length()-1; i >= 0; i--){

            reverse += character[i];

        }

        return reverse;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println(FirstReverse(scn.nextLine()));

    }

}
