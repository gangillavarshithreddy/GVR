public class Student {
    
    String name;
    int rollNumber;
    String grade;
    int age;
    String course;

    
    Student(String name, int rollNumber, String grade, int age, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        this.age = age;
        this.course = course;
    }

    
    void displayDetails() {
        System.out.println("Student Details");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        // Creating a Student object
        Student s = new Student(
            "dom", 67, "b", 19, "Computer Science and engineering"
        );

        
        s.displayDetails();
    }
}