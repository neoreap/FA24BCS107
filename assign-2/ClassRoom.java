public class ClassRoom {
    private String className;
    private String classCode;
    private Teacher teacher;
    private Student[] students;
    private int studentCount;

    public ClassRoom(String className, String classCode) {
        this.className = className;
        this.classCode = classCode;
        this.students = new Student[5];
        this.studentCount = 0;
    }

    @Override
    public String toString() {
        String teacherInfo = "Teacher: " + (teacher != null ? teacher.getFullName() : "Not assigned");
        String studentList = "Students (" + studentCount + "/5):\n";
        
        for (int i = 0; i < studentCount; i++) {
            studentList += "- " + students[i].getFullName() + "\n";
        }
        
        return className + " (" + classCode + ")\n" + 
               teacherInfo + "\n" + 
               studentList;
    }
}