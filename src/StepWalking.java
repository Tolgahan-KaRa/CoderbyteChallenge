public class StepWalking {

    public static void main(String[] args) {

        int stairs = (int)Math.random()*1000;
        System.out.println(countStairs(stairs));

    }

    private static int countStairs(int stairs){

        if (stairs ==1 || stairs ==2){

            return stairs;

        }

        return countStairs(stairs-1)+ countStairs(stairs-2);

    }

}
