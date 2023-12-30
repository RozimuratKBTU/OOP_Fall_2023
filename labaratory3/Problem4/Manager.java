package labaratory3.Problem4;



import java.util.Date;
import java.util.Vector;

public class Manager extends Employee{
    Vector<Employee> employees = new Vector<Employee>();
    private double bonus;

    public Manager() {
        super();
    }

    public Manager(String name , String insuranceNumber,double salary, Date hireDate, double bonus) {
        super(name, insuranceNumber,salary,hireDate);
        this.bonus = bonus;
    }




    public Manager(String name) {
        super(name);
    }


    public Manager(String name, String insuranceNumber, double salary, Date hireDate,double bonus,Vector<Employee> employees) {
        this(name, insuranceNumber, salary, hireDate,bonus);
        this.employees=employees;
    }

    public int hashCode() {
        int res = super.hashCode();
        res += 31*res + (int)bonus;
        res += 31*res + employees.hashCode();
        return res;
    }
    public boolean equals(Object o) {
        if(!(o instanceof Manager))
            return false;
        if(!super.equals(o))
            return false;
        Manager m = (Manager)o;
        return m.bonus==bonus && employees.equals(m.employees);
    }

    public String toString() {
        return super.toString() + " has bonus "+ bonus +  " and has " + employees.size() + " employees";
    }

    public int compareTo(Employee o) {
        if(super.compareTo(o)!= 0) {
            return super.compareTo(o);
        }
        Manager m = (Manager)o;
        if(this.bonus > m.bonus) {
            return 1;
        }
        if(this.bonus < m.bonus) {
            return -1;
        }
        return 0;
    }

    public void add(Employee e) {
        employees.add(e);
    }

    public Vector<Employee> getEmpolyees() {
        return employees;
    }


    public Object clone()  {
        Manager m = (Manager)super.clone();
        m.employees = new Vector<Employee>();
        return m;
    }

}