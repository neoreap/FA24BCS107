public class SchoolManagementSystem {
    public static void main(String[] args) {
        Principal principal = new Principal("Dr. Farah Khan", 48, 12);
        
        School school = new School("Beaconhouse School System", "DHA Phase 5, Karachi", principal);
        
        ClassRoom mathClass = new ClassRoom("Mathematics", "MAT-10");
        ClassRoom scienceClass = new ClassRoom("Science", "SCI-10");
        ClassRoom englishClass = new ClassRoom("English", "ENG-10");
        
        school.addClassroom(mathClass);
        school.addClassroom(scienceClass);
        school.addClassroom(englishClass);
        
        Teacher mathTeacher = new Teacher("Mr. Ali Raza", 35, "Mathematics", "T-101");
        Teacher scienceTeacher = new Teacher("Ms. Ayesha Malik", 32, "Biology", "T-102");
        Teacher englishTeacher = new Teacher("Mrs. Samina Shah", 40, "English Literature", "T-103");
        
        mathClass.assignTeacher(mathTeacher);
        scienceClass.assignTeacher(scienceTeacher);
        englishClass.assignTeacher(englishTeacher);
        
        Student student1 = new Student("Ahmed Khan", 15, "FA23-101");
        Student student2 = new Student("Fatima Ahmed", 16, "FAA23-102");
        Student student3 = new Student("Bilal Siddiqui", 15, "SP23-103");
        Student student4 = new Student("Zara Sheikh", 16, "FA24-104");
        Student student5 = new Student("Usman Malik", 15, "FA24-105");
        Student student6 = new Student("Hina Raza", 16, "SP25-106");
        
        mathClass.addStudent(student1);
        mathClass.addStudent(student2);
        scienceClass.addStudent(student3);
        scienceClass.addStudent(student4);
        englishClass.addStudent(student5);
        
        boolean added = englishClass.addStudent(student6);
        if (!added) {
            System.out.println("Cannot enroll " + student6.getFullName() + " - class is full!");
        }
        
        System.out.println("=== School Management System ===");
        System.out.println(school);
        
        System.out.println("\n=== Testing Equality ===");
        Student testStudent = new Student("Test", 0, "S-2023-101");
        System.out.println("Does Ahmed Khan have the same roll number? " + 
                          student1.equals(testStudent));
        
        Teacher testTeacher = new Teacher("Test", 0, "Test", "T-101");
        System.out.println("Is this the same math teacher? " + 
                          mathTeacher.equals(testTeacher));
    }
}