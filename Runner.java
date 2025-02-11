import java.util.Scanner;


public class Runner {
    //main
    public static void main(String[] args)
    {

        //instantiate first Pet
        Pet thePet1 = new Pet();
        System.out.println("Pet information: ");
        thePet1.setType("Dog");
        System.out.println("Type: " + thePet1.getType());
        thePet1.setName("Yoda");
        System.out.println("Name: " + thePet1.getName());
        thePet1.setSound("Bark");
        System.out.println("Sound: " + thePet1.getSound());
        thePet1.setAge(3);
        System.out.println("Age: " + thePet1.getAge());



        System.out.println("        ");

        //instantiate second Pet
        Pet thePet2 = new Pet();
        System.out.println("Pet information: ");
        thePet2.setType("Cat");
        System.out.println("Type: " + thePet2.getType());
        thePet2.setName("Prissy");
        System.out.println("Name: " + thePet2.getName());
        thePet2.setSound("Meow");
        System.out.println("Sound: " + thePet2.getSound());
        thePet2.setAge(7);
        System.out.println("Age: " + thePet2.getAge());

        System.out.println("        ");


        Scanner myObj = new Scanner(System.in); //Create Scanner object

        //Get and Read user input
        System.out.println("Enter animal type: ");
        String animalType = myObj.nextLine();
        System.out.println("Enter animal name: ");
        String animalName = myObj.nextLine();
        System.out.println("Enter animal age: ");
        int animalAge = myObj.nextInt();

       // String animalType = myObj.nextLine(); //Read  the user input
        Pet thePet3 = new Pet();
        System.out.println("Pet information: ");
        System.out.println("Type: " + animalType);
        System.out.println("Name: " + animalName);
        System.out.println("Sound: " + thePet3.getSound());
        System.out.println("Age: " + animalAge);



    }
}
