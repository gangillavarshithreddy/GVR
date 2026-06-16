import java.io.*;

public class StudentFile {

    
    public static void writeStudent() {
        try {
            FileWriter fw = new FileWriter("students.txt");
            fw.write("10 aahul A\n");
            fw.write("12 Praya B\n");
            fw.write("03 Arann A+\n");
            fw.close();

            System.out.println("Student data saved successfully.");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    
    public static void readStudent() {
        try {
            FileReader fr = new FileReader("students.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nStudent Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        writeStudent();
        readStudent();  
    }
}