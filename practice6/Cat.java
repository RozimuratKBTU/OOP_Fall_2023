package practice6;

public class Cat extends Animal implements CanHavePizza, ThanksGiving{
    @Override
    public void eatPizza() {
        System.out.println("happy 'meow'");
    }

    @Override
    public void voice() {
        System.out.println("meow");
    }

    @Override
    public String thanks() {
        return "thanks 'meow'";
    }
}
