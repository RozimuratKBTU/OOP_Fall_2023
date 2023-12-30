package labaratory3.problem5;

import practice2.Time;

public class Test {
    public static void main(String[] args) {
//        Test Chocolate
        Chocolate choco1 = new Chocolate(3,"AlpenGold");
        Chocolate choco2 = new Chocolate(1,"Nestle");
        Chocolate choco3 = new Chocolate(2,"Sneakers");
        Chocolate[] array = new Chocolate[3];
        array[0] = choco1;
        array[1] = choco2;
        array[2] = choco3;

        Sort.bubbleSort(array);
        System.out.println("Chocolate:\n");
        for (Chocolate ch:array) {
            System.out.println(ch);
        }

//        Test Employee
        Time t1 = new Time(21, 5, 6);
        Time t2 = new Time(12, 10, 59);
        Time t3 = new Time(12, 20, 44);

        Time[] array2= new Time[3];
        array2[0] = t1;
        array2[1] = t2;
        array2[2] = t3;

        Sort.quickSort(array2, 0, array2.length-1);

        System.out.println("\n");
        System.out.println("Time:");

        for (Time time: array2) {
            System.out.println(time.toStandard());
        }
    }
}
