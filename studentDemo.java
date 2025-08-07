package alexjava;
import java.util.*;

class Student {
    String name;
    String regNo;
    String course;
    double[] marks = new double[6];
    double totalMarks;
    int rank;

    Student(String name, String regNo, String course, double[] marks, double totalMarks,int rank) {
        this.name = name;
        this.regNo = regNo;
        this.course = course;
        this.marks = marks;
        this.totalMarks = totalMarks;
        this.rank = rank;
    }
}

public class studentDemo {

    
     static double total(double[] marks) {
        double totalMarks = 0;
        for (int i = 0; i < marks.length; i++) {
            totalMarks += marks[i];
        }
        return totalMarks;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        in.nextLine(); 
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1));
            System.out.print("Name: ");
            String name = in.nextLine();
            System.out.print("Register Number: ");
            String regNo = in.nextLine();
            System.out.print("Course: ");
            String course = in.nextLine();
            double[] marks = new double[6];
            System.out.println("Enter marks for 6 subjects: ");
            for (int j = 0; j < 6; j++) {
                marks[j] = in.nextDouble();
            }
            in.nextLine(); 
            double total = total(marks);
            students[i] = new Student(name, regNo, course, marks, total, i);
        }
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students[j].totalMarks < students[j + 1].totalMarks) {
                    Student temp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = temp;
                }
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nStudent " + (i + 1) + ": " + students[i].name +
                               ", RegNo: " + students[i].regNo +
                               ", Course: " + students[i].course +
                               ", Total Marks: " + students[i].totalMarks);
        }

        in.close();
    }
}
