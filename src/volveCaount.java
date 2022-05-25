import java.util.Scanner;

public class volveCaount {

    public static String volvesCaunt(String str){

        int caunt = 0;

        for (int i = 0; i< str.length(); i++){

            char vChar = str.charAt(i);

            if (vChar=='a' || vChar=='e' || vChar=='o' || vChar=='u' || vChar=='i'){

                caunt++;

            }

        }

        String sCaunt = Integer.toString(caunt);

        return sCaunt;
    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String a = scn.nextLine();

        System.out.println(volvesCaunt(a));

    }

}
