import java.util.Scanner;

public class Runner {
    public static void main (String[] args)
    {
        //create scanner variable
        Scanner scan = new Scanner(System.in);

        //instantiate an object of our class using constructor
        Tests scoreSum = new Tests();
        scoreSum.getAverage();
        System.out.println(scoreSum);

    }
}
