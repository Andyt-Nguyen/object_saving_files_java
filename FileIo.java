import java.io.*;

public class FileIo {
    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
        // create instance of person.
        // Make sure to serialize the object
        People people = new People();
        Person andy = new Person(1,"Andy", 20);
        Person samantha = new Person(2,"Samantha", 20);

        people.addPeople(andy);
        people.addPeople(samantha);

        
        // write file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("People.txt"));
        out.writeObject(people); // save data

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("People.txt"));
        People savedPeople = (People) in.readObject();
        
        savedPeople.outputPeople();
        // System.out.println(savedPeople);
        in.close();
    }
}