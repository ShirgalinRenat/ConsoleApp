package DataModel;
//hello
public class Person implements Comparable<Person> {
    Private String name;
    public Person(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.toString());
    }
}
