// MainProgram.java
import CIE.Internals;
import SEE.External;
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        Internals[] internalsArray = new Internals[numStudents];
        External[] externalsArray = new External[numStudents];

        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1));
            System.out.print("USN: ");
            String usn = scanner.next();

            System.out.print("Name: ");
            String name = scanner.next();

            System.out.print("Semester: ");
            int sem = scanner.nextInt();

            System.out.println("Enter Internal Marks for 5 courses:");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                internalMarks[j] = scanner.nextInt();
            }

            internalsArray[i] = new Internals(usn, name, sem, internalMarks);

            System.out.println("Enter SEE Marks for 5 courses:");
            int[] seeMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                seeMarks[j] = scanner.nextInt();
            }

            externalsArray[i] = new External(usn, name, sem, seeMarks);
        }

        // Calculate and display final marks
        System.out.println("\nFinal Marks of Students:");
        for (int i = 0; i < numStudents; i++) {
            int[] internalMarks = internalsArray[i].getInternalMarks();
            int[] seeMarks = externalsArray[i].getSeeMarks();

            int[] finalMarks = new int[5];
            int totalMarks = 0;

            System.out.println("Student " + (i + 1) + " - " + internalsArray[i].getName());

            for (int j = 0; j < 5; j++) {
                finalMarks[j] = internalMarks[j] + seeMarks[j];
                totalMarks += finalMarks[j];
                System.out.println("Course " + (j + 1) + ": " + finalMarks[j]);
            }

            System.out.println("Total Marks: " + totalMarks + "\n");
        }
    }
}
