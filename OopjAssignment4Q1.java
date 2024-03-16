/* 1) Build a class Student which contains details about the Student 
      and compile and run its instance. */

class Student {

    String name;
    int rollNo;
    char division;

    public Student(String name, int rollNo, char division) {
        this.name = name;
        this.rollNo = rollNo;
        this.division = division;
    }

    public void displayStudentDetails() {
        System.out.println("student Details ---->");
        System.out.println("Name        : " + this.name);
        System.out.println("Division    : " + this.division);
        System.out.println("Roll No     : " + this.rollNo);

    }
}

public class OopjAssignment4Q1 {

    public static void main(String[] args) {

        Student student = new Student("Aniket Dhiwar", 54220064, 'A');
        student.displayStudentDetails();

    }
}
