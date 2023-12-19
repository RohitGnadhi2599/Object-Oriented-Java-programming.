import java.util.Scanner;
import java.io.*;

class Student {
    private String usn;
    private String name;
    private int[] credits;
    private int[] marks;

    // Constructor
    public Student(String usn, String name, int numSubjects) {
        this.usn = usn;
        this.name = name;
        this.credits = new int[numSubjects];
        this.marks = new int[numSubjects];
    }

    // Method to accept details
    public void acceptDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for student " + name + " (USN: " + usn + ")");
        for (int i = 0; i < credits.length; i++) {
            System.out.print("Enter credits for subject " + (i + 1) + ": ");
            credits[i] = scanner.nextInt();

            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();
        }
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Details for student " + name + " (USN: " + usn + ")");
        for (int i = 0; i < credits.length; i++) {
            System.out.println("Subject " + (i + 1) + " - Credits: " + credits[i] + ", Marks: " + marks[i]);
        }
    }

    // Method to calculate SGPA
    public double calculateSGPA() {
        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i = 0; i < credits.length; i++) {
            totalCredits += credits[i];
            totalGradePoints += calculateGradePoints(marks[i]) * credits[i];
        }

        return totalGradePoints / totalCredits;
    }

    // Helper method to calculate grade points based on marks
    private double calculateGradePoints(int marks) {
        if (marks >= 90) {
            return 10.0;
        } else if (marks >= 80) {
            return 9.0;
        } else if (marks >= 70) {
            return 8.0;
        } else if (marks >= 60) {
            return 7.0;
        } else if (marks >= 50) {
            return 6.0;
        } else {
            return 0.0;
        }
    }
}

public class StudentSGPA {
    public static void main(String[] args) {
        System.out.print("my name is Rohit Gandhi");
        System.out.print("my USN is 2023BMS02599");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        System.out.print("Enter the USN: ");
        String usn = scanner.next();

        System.out.print("Enter the name: ");
        String name = scanner.next();

        Student student = new Student(usn, name, numSubjects);
        student.acceptDetails();

        // Displaying details and SGPA
        student.displayDetails();
        System.out.println("SGPA: " + student.calculateSGPA());
    }
}
