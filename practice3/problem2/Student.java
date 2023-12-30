package practice3.problem2;


public class Student extends Person {
    public String program;
    public int year;
    public double fee;

    public Student() {}

    public Student(String name, String address, String program, int year, double fee ) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String toString() {
        return super.toString() + " " + program + " " + year+ " " + fee;
    }

}