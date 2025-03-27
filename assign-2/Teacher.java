public class Teacher extends Person {
    private String subject;
    private String teacherId;
    private ClassRoom assignedClass;

    public Teacher(String fullName, int age, String subject, String teacherId) {
        super(fullName, age);
        this.subject = subject;
        this.teacherId = teacherId;
    }

    public String getSubject() {
        return subject;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public ClassRoom getAssignedClass() {
        return assignedClass;
    }

    public void assignToClass(ClassRoom classRoom) {
        this.assignedClass = classRoom;
    }

    public void unassignFromClass() {
        this.assignedClass = null;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Teacher)) return false;
        Teacher otherTeacher = (Teacher) other;
        return teacherId.equals(otherTeacher.teacherId);
    }

    @Override
    public String toString() {
        String assignment = assignedClass != null ? 
            "Teaching " + assignedClass.getClassName() : "Not assigned to any class";
        return "Teacher: " + super.toString() + 
               " (" + subject + ", ID: " + teacherId + ") - " + assignment;
    }
}