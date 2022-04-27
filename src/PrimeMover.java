import java.util.Scanner;

public class PrimeMover {

    public static int PrimeMover(int num){

        int toplam = 0;
        int asal = 0;

        for (int i =2; i<num; i++){

            if (num%i == 0){

                toplam++;

            }

        }

        return toplam;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(PrimeMover(scn.nextInt()));
    }

}
