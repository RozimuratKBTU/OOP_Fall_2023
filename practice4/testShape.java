package practice4;

import java.util.Vector;

public class    testShape {
    public static void main(String[] args){
        Circle c = new Circle(Color.RED, 1);
        Rectangle r = new Rectangle(Color.BLACK, 4);
        Triangle t = new Triangle(Color.BLACK, 5);
        Vector <Shape> v  = new Vector<>();
        v.add(c);
        v.add(t);
        v.add(r);

        for (Shape cur: v) {
            cur.draw();
        }
    }
}
