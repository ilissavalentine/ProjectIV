//The Exam class extends Assessment to determine the grade for an exam.

public class Exam extends Assessment{
    private int numQuestions;
    private int numMissed;
    private double pointsEach;


    //Constructor that initializes the Exam with the number of questions and number of missed questions
    public Exam(int questions, int missed){
        this.numQuestions = questions;
        this.numMissed = missed;
        this.pointsEach = 100.0 / questions;

        int score = (int) Math.round((questions - missed) * pointsEach);
        setScore(score);
    }

    //The number of points that each question is worth.
    public int getPointsEach(){
        return (int) pointsEach;
    }

    //The number of questions missed
    public int getNumMissed(){
        return numMissed;
    }
}

