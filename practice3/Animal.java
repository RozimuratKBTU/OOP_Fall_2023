package practice3;


public class Animal {
    public String movementType;
    public String diet;
    public String habitat;
    public String name= "noname";
    public Animal(){}
    public Animal(String movementType, String diet, String habitat) {
        this.movementType = movementType;
        this.diet = diet;
        this.habitat = habitat;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public String eat() {
        return "Yes";
    }

    public String toString() {
        return movementType +" "+ diet+" " + habitat;
    }


}
