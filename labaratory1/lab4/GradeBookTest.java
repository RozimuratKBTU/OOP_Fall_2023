package labatory1.lab4;

public class GradeBookTest {

    public static void main(String[] args) {
        GradeBook g1=new GradeBook();

        g1.addStudent(new Student("Student A"));
        g1.addStudent(new Student("Student B"));
        g1.addStudent(new Student("Student C"));
        g1.addStudent(new Student("Student D"));
        g1.addStudent(new Student("Student E"));
        g1.addStudent(new Student("Student F"));
        g1.addStudent(new Student("Student G"));

        g1.displayGradeReport();
        g1.distubutionGrade();
        System.out.println(g1);
    }

}