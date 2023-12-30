package practice3;



public class Dog extends Animal {
    public String breed;
    public String color;
    public String name = "noname";
    public Dog() {}

    public Dog(String breed, String color) {
        super("hodit", "hishnik", "susha");
        this.breed = breed;
        this.color = color;
    }
    public void setName(String name) {
        this.name = name;

    }

    public String eat(String food) {
        return food;
    }

    public String toString() {
        return super.toString() + " " + breed+" " + color+" "
                + name+" ";
    }


}