package practice2;

public class StarTriangle {
    int n;
    public StarTriangle(int k) {
        n = k;
    }

    public String toString(){
        String line = "\n";
        String star = "[*]";
        String res = "";

        for (int i = 0; i < n; i++) {

            res += line;
            for (int j = 0; j <= i; j++) {
                res += star;
            }
        }
        return res;
    }
}


