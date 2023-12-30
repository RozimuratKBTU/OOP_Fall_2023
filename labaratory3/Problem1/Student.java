package labaratory3.Problem1;

public class Student extends Person implements GoShop, EatAble{


    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public boolean eat() {
        return true;
    }

    @Override
    public boolean go() {
        return true;
    }
}
