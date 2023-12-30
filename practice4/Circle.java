package practice4;

public class Circle extends Shape {
    public Circle(Color color, int pos){
        super(color, pos);
    }

    @Override
    void draw() {
        String space = "";
        for (int i = 0; i < pos; i++) {
            space += " ";
        }
        if(color == Color.RED){
            System.err.println(space + "()");
        }
        else{
            System.out.println(space + "()");
        }
    }
}
