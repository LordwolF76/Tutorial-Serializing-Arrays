import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by LordwolF on 8/12/2016.
 */
public class WriteObjects {
    public static void main(String[] args) {
        System.out.println("Writing Objects");

        Person[] people = {new Person(1, "Sue"), new Person(99, "Mike"), new Person(7, "Bob")};

        ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));

        try (FileOutputStream fs = new FileOutputStream("people.bin")) {
            try (ObjectOutputStream os = new ObjectOutputStream(fs)) {

                os.writeObject(people);

                os.writeObject(peopleList);

                os.writeInt(peopleList.size());

                for (Person person : peopleList) {
                    os.writeObject(person);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
