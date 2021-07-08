package de.tum.in.ase.eist;

public class Main {

    private Main() {
    }

    // TODO: Test your solution with this main method, exceptions may be thrown before the bugs are fixed!
    public static void main(String[] args) {
        String firstName1 = "Erika";
        String lastName1 = "Musterfrau";
        String firstName2 = "Max";
        String lastName2 = "Mustermann";

        Student student1 = new Student(firstName1, lastName1);
        Student student2 = new Student(firstName2, lastName2);

        Course course = new Course("EIST");
        course.addParticipant(student1);
        course.addParticipant(student2);

        TUMOnline tumOnline = new TUMOnline();
        tumOnline.enrolStudent(student1);
        tumOnline.enrolStudent(student2);
        tumOnline.registerCourse(course);
        Student foundStudent = tumOnline.findStudentByName(firstName1, lastName1);

        if (foundStudent == null) {
            throw new RuntimeException("%s %s was not found, despite being registered in the course!".formatted(firstName1, lastName1));
        }
    }

}
