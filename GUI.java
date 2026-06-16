import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollNo;
    String name;
    String grade;

    Student(int rollNo, String name, String grade) {
        this.rollNo = rollNo;
        this.name = name;
        this.grade = grade;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
        System.out.println("Grade  : " + grade);
        System.out.println();
    }
}

public class GUI {
    static ArrayList<Student> students = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    
    static void addStudent() {
        System.out.print("Enter Roll No: ");
        int rollNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Grade: ");
        String grade = sc.nextLine();

        students.add(new Student(rollNo, name, grade));
        System.out.println("Student Added Successfully!\n");
    }

    
    static void removeStudent() {
        System.out.print("Enter Roll No to Remove: ");
        int rollNo = sc.nextInt();

        for (Student s : students) {
            if (s.rollNo == rollNo) {
                students.remove(s);
                System.out.println("Student Removed Successfully!\n");
                return;
            }
        }
        System.out.println("Student Not Found!\n");
    }

    
    static void searchStudent() {
        System.out.print("Enter Roll No to Search: ");
        int rollNo = sc.nextInt();

        for (Student s : students) {
            if (s.rollNo == rollNo) {
                System.out.println("Student Found:");
                s.display();
                return;
            }
        }
        System.out.println("Student Not Found!\n");
    }

    
    static void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Available!\n");
            return;
        }

        System.out.println("Student List:");
        for (Student s : students) {
            s.display();
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("Student Management System ");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Search Student");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    searchStudent();
                    break;
                case 4:
                    displayStudents();
                    break;
                case 5:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid Choice!\n");
            }
        } while (choice != 5);
    }
}