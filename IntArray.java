import java.util.Arrays;
import java.util.Random;


public class IntArray {
    //private data fields for the IntArray class
    private int length;
    private int myArray[];

    //public Constructor
    public IntArray(int l){
        this.length = l;
        this.myArray = new int[l];
    }

    //Clearing the array
    public void clear(){
        for (int i = 0; i<length; i++){
            myArray[i] = 0;
        }
    }

    //Fills the array with some random numbers between 1-6
    public void fillRand(){
        Random rand = new Random();
        for(int i = 0; i<length; i++){
            myArray[i] = rand.nextInt(6)+1;
        }
    }


    //Sorts the array - ascending
    public void sort(){
        java.util.Arrays.sort(myArray);
    }

    public boolean isEmpty(){
        for(int num: myArray){
            if (num != 0){
                return false;
            }
        }
        return true;
    }


    //returns the size of array
    public int size(){
        return length;
    }


    //Set method
    public void set(int index, int newValue){
        if(index >= 0 && index < length){
            myArray[index] = newValue;
        } else {
            throw new IndexOutOfBoundsException("Index is out of the required range");
        }

    }

    //Get method
    public int get(int index){
        if (index >= 0 && index < length){
            return myArray[index];
        }
        throw new IndexOutOfBoundsException("Index is out of the required range");
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < myArray.length; i++) {
            sb.append("Element ").append(i).append(":").append(myArray[i]).append("\n");
        }
        return sb.toString();
    }
    }




