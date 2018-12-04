import java.io.Serializable;
import java.util.ArrayList;

public class People implements Serializable {
    private ArrayList <Person> personList;

    public People() {
        personList = new ArrayList<Person>();
    }
    public ArrayList<Person> getPeople() {
        return personList;
    }

    public void addPeople(Person person) {
        personList.add(person);
    }

    public void removePerson(int id) {
        for(int i = 0; i < personList.size(); i++) {
            if(id == personList.get(i).getId()) {
                System.out.println("Person removed");
                personList.remove(i);
            } else {
                System.out.println("Cannot find person");
            }
        }
    }

    public void outputPeople() {
        for(int i = 0; i < personList.size(); i++) {
            System.out.println(personList.get(i).getName());
        }
    }
}