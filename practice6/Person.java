package practice6;

public class Person implements CanHavePizza, ThanksGiving {

    @Override
    public void eatPizza() {
        System.out.println("take my money");
    }

    public boolean pay(){
        return true;
    }


    @Override
    public String thanks() {
        return "thank you";
    }
}
