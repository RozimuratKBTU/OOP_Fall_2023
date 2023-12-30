package practice4;

public abstract class Shape {
    Color color;
    int pos;
    public Shape(){}
    public Shape(Color color, int pos){
        this.color = color;
        this.pos = pos;
    }
    abstract void draw();
}
