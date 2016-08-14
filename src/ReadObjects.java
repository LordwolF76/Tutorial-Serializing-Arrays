import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * Created by LordwolF on 8/12/2016.
 */
public class ReadObjects {
    public static void main(String[] args) {

        System.out.println("Reading Objects...");

        try (FileInputStream fi = new FileInputStream("people.bin")) {

            ObjectInputStream oi = new ObjectInputStream(fi);

            Person[] people = (Person[])oi.readObject();

            @SuppressWarnings("unchecked")
            ArrayList<Person> peopleList = (ArrayList<Person>)oi.readObject();

            for(Person person: people) {
                System.out.println(person);
            }

            for(Person person: peopleList) {
                System.out.println(person);
            }

            int num = oi.readInt();

            for(int i=0; i<num; i++){
                Person person = (Person)oi.readObject();
                System.out.println(person);
            }

            oi.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
