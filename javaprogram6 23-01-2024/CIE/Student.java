// CIE/Student.java
package CIE;

public class Student {
    protected String usn;
    protected String name;
    protected int sem;

    // Parameterized constructor
    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }

    // Default constructor
    public Student() {
        this("", "", 0);
    }

    // Getter for name
    public String getName() {
        return name;
    }
}
