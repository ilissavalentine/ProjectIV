

public class Pet {
    //private data fields
    private String name;

    //public Constructor(s)
    public Pet()
    {
        this.setName("");
    }

    //public set or mutator method for every private date field (except when the data field is read-only)
    public void setName(String newName)
    {
        this.name = newName;
    }

    //public get or accessor method for every private data field (except if it is a secret)
    public String getName()
    {
        return this.name;
    }

    //public toString method that prints out all the object state (meaning that the data in the object instance that you will later instantiate in the main() method)
    public String toString()
    {
        String output = "Pet information: ";
        output += this.getName();
        return output;
    }

    //main
    public static void main(String[] args)
    {
        //instantiate first Pet
        Pet thePet1 = new Pet();
        thePet1.setName("Pet Name");
        System.out.println("Pet information: ");
        System.out.println("Name: " + thePet1.getName());
        //maybe change above to pet name instead of rocky

        System.out.println("        ");

        //instantiate second Pet
        Pet thePet2 = new Pet();
        thePet2.setName("Rocky");
        System.out.println("Pet information: ");
        System.out.println("Name: " + thePet2.getName());


    }


}
