

public class Pet {
    //private data fields
    private String name;
    private String type;
    private int age;
    private String sound;

    //public Constructor(s)
    public Pet()
    {
        this.setName("");
        this.setType("");
        this.setAge(10);
        this.setSound("");
    }


    //public set or mutator methods
    public void setName(String newName)
    {
        this.name = newName;
    }

    //public set or mutator method for every private date field (except when the data field is read-only)
   public void setType(String newType)
    {
        this.type = newType;
    }

    //public set or mutator method for every private date field (except when the data field is read-only)
    public void setAge(int newAge)
    {
        this.age = newAge;
    }

    public void setSound(String newSound)
    {
        this.sound = newSound;
    }


    //public get or accessor methods
    public String getName()
    {
        return this.name;
    }

    public String getType()
    {
        return this.type;
    }

    public int getAge()
    {
        return this.age;
    }

    public String getSound() {
        if (this.type.equalsIgnoreCase("dog")) {  // Convert type
            return "bark";
        } else if (this.type.equalsIgnoreCase("cat")) {
            return "meow";
        } else {
            return "animal noise";
        }

    }


    //public toString method that prints out all the object state (meaning that the data in the object instance that you will later instantiate in the main() method)
    public String toString()
    {
        String output = "Pet information: ";
        output += this.getName();
        String output1 = "Type: ";
        output1 += this.getType();
        String output2 = "Sound: ";
        output2 += this.getSound();
        String output3 = "Age: ";
        output3 += this.getAge();
        return output;




    }


}

