package labatory1.lab4;

public class Student {

    private int yearOfStudy;
    private String name;
    private int id;

    public Student(int id,String name) {
        this.id=id;
        this.name=name;
    }
    public Student(int id,String name,int yearOfStudy) {
        this.id=id;
        this.name=name;
        this.yearOfStudy=yearOfStudy;
    }
    public Student(int id) {
        this.id=id;
    }
    public Student() {
        this.id=0;
        this.name="Unknown Name";
        this.yearOfStudy=0;

    }
    public Student(String name) {
        this.name=name;
    }

    public int getId() {
        return id;
    }
    public int getyearOfStudy() {
        return yearOfStudy;
    }
    public String getName() {
        return name;
    }

    public String toString() {
        return "Student id:"+id+"Student name:"+name+"Student year of study :"+yearOfStudy;
    }



//    String name,id ;
//    int yearOfStudy;
//
//    public Student(String name, String id, int year_of_study){
//        this.name = name;
//        this.id = id;
//        this.yearOfStudy = year_of_study;
//    }
//    public String getName(){
//        return name;
//    }
//    public String getId(){
//        return id;
//    }
//    public int getYearOfStudy(){
//        return yearOfStudy;
//    }
//    public void increment(){
//        yearOfStudy++;
//        System.out.println(yearOfStudy);
//    }


}
