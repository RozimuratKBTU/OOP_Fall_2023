package labatory1.lab5;

import java.util.Vector;

public class DragonLaunch {
    private Vector<Person> kidnappedPeople;

    public DragonLaunch() {
        kidnappedPeople = new Vector<>();
    }

    public void kidnap(Person person) {     //BBGG
        kidnappedPeople.add(person);
    }

    public boolean willDragonEatOrNot() {
        int remainingPairs = 0;

        for (Person person : kidnappedPeople) {
            if (person.getGender() == Gender.BOY) {
                remainingPairs++;
            } else {
                if (remainingPairs > 0) {
                    remainingPairs--;
                } else {
                    return false;
                }
            }
        }

        return remainingPairs == 0;
    }

    public static void main(String[] args) {
        DragonLaunch dragonLaunch = new DragonLaunch();

        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        dragonLaunch.kidnap(new Person(Gender.GIRL));


//Дракон начинает есть, если у него появляется девочка (Gender.GIRL), и до этого он не похищал парня (Gender.BOY).
//В противном случае дракон не будет есть.
//Если вектор kidnappedPeople пустой, то дракон не будет есть.

        boolean dragonWillEat = !dragonLaunch.willDragonEatOrNot();
        System.out.println("Dragon will eat: " + dragonWillEat);

        dragonLaunch = new DragonLaunch();
        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        dragonLaunch.kidnap(new Person(Gender.BOY));
        dragonLaunch.kidnap(new Person(Gender.GIRL));
        dragonLaunch.kidnap(new Person(Gender.GIRL));


        dragonWillEat = !dragonLaunch.willDragonEatOrNot();
        System.out.println("Dragon will eat: " + dragonWillEat);
    }
//    willDragonEatOrNot возвращает true, когда дракон будет есть (когда он похищает девочку после мальчиков).
//willDragonEatOrNot возвращает false, когда дракон не будет есть (когда он продолжает похищать мальчиков или видит девочку сразу после мальчиков).
}
