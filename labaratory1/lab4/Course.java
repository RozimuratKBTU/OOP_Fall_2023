package labatory1.lab4;

public class Course {
    String name;
    String description;
    int NumberOfCredits;

    public Course(String name,String description,int NumOfCredits) {
        this.name=name;
        this.description=description;
        this.NumberOfCredits=NumOfCredits;
    }

    public String toString() {
        return "Course name"+name+"Course description:"+description+"Course Number of credits :"+NumberOfCredits;
    }
}