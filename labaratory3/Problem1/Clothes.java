package labaratory3.Problem1;

import java.util.Vector;

public abstract class Clothes {
    String name;
    int count;
    int id;
    Vector<Size> sizes = new Vector<Size>();

    public Clothes(String name, int count, int id) {
        this.name = name;
        this.count = count;
        this.id = id;

    }

    @Override
    public  String toString(){
        return  this.getClass() + "[name= "+ name + ", count =" + count + ", id= " + id + "]";
    }
}
