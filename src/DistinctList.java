import java.lang.reflect.Array;
import java.util.Arrays;

public class DistinctList {

    public static void main(String[] args) {

        int [] a = {0,-2,-2,5,5,5};


        int sayac = 0;

        Arrays.sort(a);

        for (int i=0; i<(a.length-1); i++ ){

            if (a[i] != a[i+1]){

                sayac++;

            }

        }
        System.out.println(sayac);
    }

}
