package labaratory3.Problem4;

import java.util.Comparator;

public class ComparatorByHireDate implements Comparator<Employee> {
//    ComparatorByHireDate(){}
//    Hire Date - Дата Приема

    public int compare(Employee e1, Employee e2){

        return e1.hireDate.compareTo(e2.hireDate);
    }
}
