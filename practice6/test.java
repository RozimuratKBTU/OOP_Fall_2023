package practice6;

public class test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Person person = new Person();
        Restaurant res = new Restaurant();
        System.out.println(res.servePizza(person));
        System.out.println(res.servePizza(cat));
    }
}
