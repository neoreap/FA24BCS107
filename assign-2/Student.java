public class Student extends Person {
    private String rollNumber;
    private ClassRoom enrolledClass;

    public Student(String fullName, int age, String rollNumber) {
        super(fullName, age);
        this.rollNumber = rollNumber;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public ClassRoom getEnrolledClass() {
        return enrolledClass;
    }

    public void enrollInClass(ClassRoom classRoom) {
        this.enrolledClass = classRoom;
    }

    public void unenrollFromClass() {
        this.enrolledClass = null;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Student)) return false;
        Student otherStudent = (Student) other;
        return rollNumber.equals(otherStudent.rollNumber);
    }

    @Override
    public String toString() {
        String enrollment = enrolledClass != null ? 
            "Enrolled in " + enrolledClass.getClassName() : "Not enrolled in any class";
        return "Student: " + super.toString() + 
               " (Roll#: " + rollNumber + ") - " + enrollment;
    }
}