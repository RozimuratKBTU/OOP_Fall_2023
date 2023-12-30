package labatory1.lab4;



import java.util.ArrayList;
import java.util.Arrays;

public class GradeBook {
    private ArrayList<Student> stList=new ArrayList<Student>();
    Course oop=new Course("Object-oriented Programing Design","Object-oriented Programing Design" , 5);
    private double grades[]= {100,56,78,98,45,33,24};

    public GradeBook() {

    }
    public void displayMessage() {
        System.out.println("Wellcome to GradeBook "+oop.name+'!');
    }
    public double determineClassAvr() {
        int sum=0;
        int counter=grades.length;
        for(int i=0;i<counter;i++) {
            sum+=grades[i];
        }
        return sum/counter;
    }
    public double determineMax() {
        double max=Integer.MIN_VALUE;
        for(int i=0;i<grades.length;i++) {
            max=Math.max(max, grades[i]);
        }
        return max;
    }
    public double determineMin() {
        double min=Integer.MAX_VALUE;
        for(int i=0;i<grades.length;i++) {
            min=Math.min(min, grades[i]);
        }

        return min;
    }
    public String maxReport() {
        double max=determineMax();
        int index=0;
        for(int i=0;i<grades.length;i++) {
            if(grades[i]==max)
                index=i;
        }
        return ".The Highest grade : "+"("+stList.get(index).getName()+","+"id: "+index;
    }
    public String minReport() {
        double min=determineMin();
        int index=0;
        for(int i=0;i<grades.length;i++) {
            if(grades[i]==min)
                index=i;
        }

        return ".The Lowest grade : "+"("+stList.get(index).getName()+","+"id: "+index;
    }

    public void displayGradeReport() {
        System.out.println("Class avarage : "+determineClassAvr() +maxReport()+')'+" "+minReport()+')');
    }

    public void distubutionGrade() {

        int counter=0;

        for(int i=0;i<100;i+=10)
        {
            for(int j=0;j<grades.length;j++)
            {
                if(grades[j]<=i+10 && grades[j]>=i)
                    counter++;

            }
            System.out.println(i+"-"+(i+10)+':'+"*".repeat(counter));
            counter=0;
        }
    }


    public void addStudent(Student s) {
        stList.add(s);
    }

    public String toString() {
        StringBuilder resultString = new StringBuilder("Students list: ");

        for (Student st : stList)  resultString.append(st.getName()+" ");
        return resultString+"\nStudents grade:"+ Arrays.toString(grades);
    }

}
