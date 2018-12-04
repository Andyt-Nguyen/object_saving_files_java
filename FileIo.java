import java.io.*;

public class FileIo {
    public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
        // create instance of person.
        // Make sure to serialize the object
        Person person = new Person("Andy", 20);

        // write file
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Person.txt"));
        out.writeObject(person); // save data

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Person.txt"));
        Person savedPerson = (Person) in.readObject();
        
        System.out.println(savedPerson.getName());
        in.close();
    }
}