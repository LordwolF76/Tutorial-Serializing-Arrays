import java.io.Serializable;

/**
 * Created by LordwolF on 8/12/2016.
 */

//this makes them Serializable for writing text
public class Person implements Serializable{

    //private static final long serialVersionUID =

    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}

