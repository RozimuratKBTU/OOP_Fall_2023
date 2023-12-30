package labaratory3.problem5;

public class Chocolate implements Comparable<Chocolate> {
    String name;
    double weight;
    public Chocolate(int weight, String name){
        this.weight = weight;
        this.name = name;
    }
    public String toString(){
        return "This is "+ name + " with weight " + weight;
    }
    public int compareTo(Chocolate o){
        if(this.weight > o.weight) return 1;
        if(this.weight < o.weight) return -1;
        return 0;
    }
}
