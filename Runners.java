import javax.swing.JOptionPane;
/**
 This program demonstrates the Exam class,
 which extends the Assessment class.
 */

public class Runners {
        public static void main(String[] args) {
            String input;     // To hold input
            int questions = 0;    // Number of questions
            int missed = 0;       // Number of questions missed
            boolean validInput = false;
            Exam exam = null;
            

            //This loop will run until valid input is provided
            while (!validInput) {
                try {
                    input = JOptionPane.showInputDialog("How many questions are on the exam?");
                    questions = Integer.parseInt(input);

                    if (questions <= 0) {
                        throw new ArithmeticException("Number of questions must be greater than zero.");
                    }

                    input = JOptionPane.showInputDialog("How many questions did the student miss?");
                    missed = Integer.parseInt(input);

                    if (missed < 0 || missed > questions) {
                        throw new IllegalArgumentException("Missed questions must be between 0 and total number of questions.");
                    }

                    //Create Exam object
                    exam = new Exam(questions, missed);

                    //If inout is valid, exit the loop
                    validInput = true;
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Enter a valid number.");
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null, "The number of questions must be greater than 0.");
                } catch (IllegalArgumentException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage());
                }
            }

            //Show the results
            String message = "Each question counts " + exam.getPointsEach();
            message += " points.\nThe exam score is " + exam.getScore();
            message += "\nThe exam grade is " + exam.getGrade();

            JOptionPane.showMessageDialog(null, message);
            System.exit(0);

        }
    }

