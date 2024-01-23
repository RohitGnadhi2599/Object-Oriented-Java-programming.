import java.util.Arrays;

public class Student {
    private int registrationNumber;
    private String fullName;
    private short semester;
    private float cgpa;

    // Default constructor
    public Student() {
    }

    // Parameterized constructor
    public Student(int registrationNumber, String fullName, short semester, float cgpa) {
        this.registrationNumber = registrationNumber;
        this.fullName = fullName;
        this.semester = semester;
        this.cgpa = cgpa;
    }

    // Display method
    public void display() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Full Name: " + fullName);
        System.out.println("Semester: " + semester);
        System.out.println("CGPA: " + cgpa);
        System.out.println("-----------------------");
    }

    // Sort student records by CGPA
    public static void sortByCGPA(Student[] students) {
        Arrays.sort(students, (s1, s2) -> Float.compare(s2.cgpa, s1.cgpa));
    }

    // Sort student records by name
    public static void sortByName(Student[] students) {
        Arrays.sort(students, (s1, s2) -> s1.fullName.compareToIgnoreCase(s2.fullName));
    }
}
