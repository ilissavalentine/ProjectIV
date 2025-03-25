import java.util.ArrayList;

public class Asn5 {
    public static void main(String[] args) {
        //Created the first ArrayList that consists of Strings
        ArrayList<String> fruits = new ArrayList<String> ();
        fruits.add("Strawberries");
        fruits.add("Watermelon");
        fruits.add("Blueberries");
        fruits.add("Pineapples");
        System.out.println(fruits);

        //Created the second ArrayList that consists of Integers
        ArrayList<Integer> ints = new ArrayList<Integer> ();
        ints.add(25);
        ints.add(19);
        ints.add(104);
        ints.add(3);
        System.out.println(ints);

        //Displayed the contents using a type of loop
        System.out.println("ArrayList for Strings: ");
        for (int i = 0;  i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

            System.out.println("ArrayList for Integers: ");
        for (int i = 0;  i < ints.size(); i++){
            System.out.println(ints.get(i));
        }

        //Tried out two other operations for ArrayList
        fruits.remove(1);
        ints.remove(2);

        //Display updated lists
        System.out.println("\nUpdated ArrayList for Strings: ");
        for (int i = 0;  i < fruits.size(); i++){
            System.out.println(fruits.get(i));
        }

        System.out.println("\nUpdated ArrayList for Integers: ");
        for (int i = 0;  i < ints.size(); i++){
            System.out.println(ints.get(i));
        }


    }
}



