import java.util.ArrayList;

public class School {
    private String name;
    private String address;
    private Principal principal;
    private ArrayList<ClassRoom> classrooms;

    public School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.classrooms = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Principal getPrincipal() {
        return principal;
    }

    public ArrayList<ClassRoom> getClassrooms() {
        return classrooms;
    }

    public void addClassroom(ClassRoom classroom) {
        classrooms.add(classroom);
    }

    public boolean removeClassroom(ClassRoom classroom) {
        return classrooms.remove(classroom);
    }

    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("School: ").append(name).append("\n");
        info.append("Address: ").append(address).append("\n");
        info.append(principal).append("\n");
        info.append("Classrooms: ").append(classrooms.size()).append("\n");
        for (ClassRoom classroom : classrooms) {
            info.append(classroom).append("\n");
        }
        return info.toString();
    }
}