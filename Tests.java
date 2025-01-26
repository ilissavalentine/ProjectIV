
public class Tests {
    public static void main (String[] args)
    {
        //declare variables for test scores 1,2, and 3
        double score1 = 66.7;
        double score2 = 78.8;
        double score3 = 54.9;

        //set up calculation to get the sum of the 3 scores
        double total = score1+score2+score3;

        //set up calculation to get the average of the 3 scores
        double average = total/3;

        //print test scores and average
        System.out.println("Test score 1: " + score1);
        System.out.println("Test score 2: " + score2);
        System.out.println("Test score 3: " + score3);
        System.out.println("The average of 3 test scores is: " + average);
    }

}
