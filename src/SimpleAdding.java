import java.util.Scanner;

public class SimpleAdding {

    public static int SimpleAdding(int num){

        int top=0;
        for (int i = 0; i<=num; i++){

            top=i+top;

        }

        return top;

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(SimpleAdding(scn.nextInt()));
    }
}
