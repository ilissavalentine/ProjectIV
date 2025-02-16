import java.text.DecimalFormat;
import java.util.Scanner;

public class Tests {
    //private data fields
    private double ave;
    private int count;
    private int score;


    //constructors
    public Tests() {
        this.ave = 0.0;
        this.count = 0;
        this.score = 0;

    }

    //set (mutator) methods
    public void setScore(int newScore) {
        this.score = newScore;
    }


    //get (accessor) methods
    public double getAve() {
        return 3.4;
    }

    public int getCount() {
        return this.count;
    }

    public int getScore() {
        return this.score;
    }

    //create average method for: user input,
    public void getAverage() {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        count = 0;

        System.out.println("Enter Test Scores (press -1 to quit): ");
        double score = scanner.nextDouble();

        //while loop
        while (score != -1) {
            sum += score;
            count++;
            System.out.println("Enter Test Scores (press -1 to quit): ");
            score = scanner.nextDouble();
        }

        //Calculate the average
        if (count > 0) {
            ave = sum / count;

        } else {
            ave = Double.NaN;
        }
        scanner.close();
    }


    //toString method
    public String toString() {
        DecimalFormat df = new DecimalFormat("0.00");
        return "The average of the " + count + " scores entered is " + df.format(ave) + ".";

    }
}




















