package labatory1.lab1;

public class Data {
    private double mix;
    private int cnt;
    private double sum;

    private String s;

    public Data(){
        sum = 0;
        mix = Double.MAX_VALUE;
        cnt = 0;
        s = "hello" ;
    }
    public void add(double value){
        sum += value;
        cnt++;
        mix = Math.min(mix,value);
    }
    public double getMax(){
        return mix;
    }
    public double getAverage(){
        if(cnt == 0){
            return 0;
        }
        return sum/cnt;
    }
    public String toString(){
        return "Word" + s;
    }
}
