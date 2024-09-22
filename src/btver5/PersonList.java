package btver5;

import java.util.ArrayList;

class PersonList {

    private ArrayList<Person> personList = new ArrayList<>();

    public void addStudent() {
        Student student = new Student();
        student.addPerson();
        personList.add(student);
    }

    public void addTeacher() {
        Teacher teacher = new Teacher();
        teacher.addPerson();
        personList.add(teacher);
    }

    public void updatePerson(String id) {
        for (Person person : personList) {
            if (person.id.equals(id)) {
                person.updatePerson(id);
                break;
            }
        }
    }

    public void deletePersonById(String id) {
        personList.removeIf(person -> person.id.equals(id));
    }

    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
            System.out.println("-------------------------------");
        }
    }

    public void findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
        if (topStudent != null) {
            System.out.println("Top student:");
            topStudent.displayInfo();
        }
    }

    public void findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equalsIgnoreCase(department)) {
                    teacher.displayInfo();
                }
            }
        }
    }

    public void checkBookBorrowing() {
        for (Person person : personList) {
            System.out.println(person.fullName + "'s Book Status:");
            person.isBookOverdue();
        }
    }
}
