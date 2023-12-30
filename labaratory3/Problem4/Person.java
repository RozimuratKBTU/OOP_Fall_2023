package labaratory3.Problem4;

import java.util.Objects;

public class Person {
    public String name;
    int age;

    protected Person() {

    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "this is " + this.getClass().getSimpleName() + " with name " + name;
    }

    public int hashCode() {
        int res = 17;

        res += 31 * res + name.hashCode();

        res += 31 * res + age;

        return res;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        return age == other.age && Objects.equals(name, other.name);
    }
}