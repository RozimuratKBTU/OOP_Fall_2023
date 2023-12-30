package practice2;

public class Student {
	private int id;
	private int grade;


	String name;
	int year_of_study = 1;
	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public Student(int id, String name, int grade) {
		this(id, name);
		this.grade = grade;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setName(String name) {
		this.name = name ;
	}
	public String getName() {
		return name;
	}
	public void incrYear() {
		year_of_study++;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String toString() {
		return id + " " + name + " " + grade + " " + year_of_study;
	}
}