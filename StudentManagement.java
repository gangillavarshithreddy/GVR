import java.util.ArrayList;

class Student {
    private int rollNo;
    private String name;
    private String grade;

    
    public Student(int rollNo, String name, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }

    
    public int getRollNo() {
        return rollNo;
    }

    
    public void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Grade   : " + grade);
        System.out.println();
    }
}

class StudentManagement{
    private ArrayList<Student> students = new ArrayList<>();

    
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    
    public void removeStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                students.remove(s);
                System.out.println("Student removed successfully.");
                return;
            }
        }
        System.out.println("Student not found.");
    }

    
    public void searchStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                System.out.println("Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("Student not found.");
    }

    
    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
            return;
        }

        System.out.println("\nStudent List:");
        for (Student s : students) {
            s.display();
        }
    }

    
    public static void main(String[] args) {
        StudentManagement sm= new StudentManagement();

        sm.addStudent(new Student(10, "ramsy", "A"));
        sm.addStudent(new Student(11, "randy", "B"));
        sm.addStudent(new Student(12, "Arun", "A+"));
        sm.displayAllStudents();

        sm.searchStudent(10);

        sm.removeStudent(11);

        sm.displayAllStudents();
    }
}