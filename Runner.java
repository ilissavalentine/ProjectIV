//this class tests all methods in the Calc class
//the Calc class exposes the following methods:
//add, subtract, multiply, divide
//user is prompted for input
import java.util.Scanner;

public class Runner {
    public static void main(String[] args){
            //instantiate a Calc object
            Calc myCalculator = new Calc();
            //get user input for two numbers
            Scanner scan = new Scanner(System.in);
        double n1 = getTheNumber(scan, "Please enter the first number: ");
        double n2 = getTheNumber(scan, "Please enter the second number: ");

            //pass the numbers to the Calc object
            myCalculator.setNum1(n1);
            myCalculator.setNum2(n2);

            //output from Calc instance
            System.out.println(myCalculator);

            //examining the instance private data fields by calling get methods
            System.out.println("Calling num1 get method: " + myCalculator.getNum1());
            System.out.println("Calling num2 get method: " + myCalculator.getNum2());

            //calling Calc methods directly
            //can use a local variable for sum if you need that value for another calculation
            double sum = myCalculator.add();
            System.out.println("The sum is: " + sum);

            //or if you don't, then just display the difference, product and quotient
            System.out.println("The difference is: " + myCalculator.subtract());
            System.out.println("The product is: " + myCalculator.multiply());
            System.out.println("The quotient is: " + myCalculator.divide());

        }

        private static double getTheNumber (Scanner scan, String prompt){
            while (true) {
                    System.out.println(prompt);
                if(scan.hasNextDouble()){
                    double number = scan.nextDouble();
                    scan.nextLine();
                    return number;
                } else {
                            System.out.println("Please enter a valid number. Example: 14 or 5.0.");
                            scan.nextLine(); //Discard the invalid entry
                    }

            }

        }

    }

