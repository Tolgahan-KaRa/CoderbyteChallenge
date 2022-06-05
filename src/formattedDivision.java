import java.text.DecimalFormat;
import java.util.Scanner;

public class formattedDivision {

    public static String formatted(int i, int j){

        double temp;

        String pattern = "###,###.####";

        DecimalFormat df = new DecimalFormat(pattern);

        temp = (double)i / (double)j ;

        String sTemp = df.format(temp);

        return sTemp;

    }

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        int nOne = scn.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int nTwo = scn.nextInt();

        if (nOne == 0){

            System.out.print("Birinci sayı sıfır olamaz");
            nOne = scn.nextInt();

        }
        if (nTwo == 0){

            System.out.print("İkinci sayı sıfır olamaz");
            nTwo = scn.nextInt();

        }

        System.out.println(formatted(nOne, nTwo));

    }

}
