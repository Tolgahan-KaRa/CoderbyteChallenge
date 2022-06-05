package EasyQuestions;

import java.util.Scanner;

public class FirstFactorial {

    public static int FirstFactorial(int num){

        int faktorial = 1;

        for (int i = 1; i <= num; i++){

            faktorial *= i;

        }

        return faktorial;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println(FirstFactorial(scn.nextInt()));

    }

}
