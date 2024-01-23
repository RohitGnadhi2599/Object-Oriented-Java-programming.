import java.util.Scanner;

public class StudentRecordDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] students = new Student[5];

        // Input student records
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Registration Number: ");
            int regNumber = scanner.nextInt();
            scanner.nextLine(); // consume newline
            System.out.print("Full Name: ");
            String name = scanner.nextLine();
            System.out.print("Semester: ");
            short semester = scanner.nextShort();
            System.out.print("CGPA: ");
            float cgpa = scanner.nextFloat();

            students[i] = new Student(regNumber, name, semester, cgpa);
        }

        // Display student records
        System.out.println("\nStudent Records:");
        for (Student student : students) {
            student.display();
        }

        // Sort by CGPA and display
        Student.sortByCGPA(students);
        System.out.println("\nSorted by CGPA:");
        for (Student student : students) {
            student.display();
        }

        // Sort by name and display
        Student.sortByName(students);
        System.out.println("\nSorted by Name:");
        for (Student student : students) {
            student.display();
        }

        scanner.close();
    }
}
