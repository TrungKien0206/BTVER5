package btver5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {
    private String department;
    private String teachingSubject;

    // Constructor
    public Teacher(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate, String department, String teachingSubject) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    // Getters and Setters
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    // Implement abstract methods
    @Override
    public void addPerson() {
        System.out.println("Adding new teacher: " + getFullName());
    }

    @Override
    public void updatePerson(String id) {
        if (this.getId().equals(id)) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Updating teacher: " + getFullName());

            // Updating full name
            System.out.print("Enter new full name: ");
            String newFullName = scanner.nextLine();
            this.setFullName(newFullName);

            // Updating date of birth
            System.out.print("Enter new date of birth (dd/MM/yyyy): ");
            String dobStr = scanner.nextLine();
            try {
                Date newDateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dobStr);
                this.setDateOfBirth(newDateOfBirth);
            } catch (ParseException e) {
                System.out.println("Invalid date format.");
            }

            // Updating Department
            System.out.print("Enter new Department: ");
            String newDepartment = scanner.nextLine();
            this.setDepartment(newDepartment);

            // Updating Teaching Subject
            System.out.print("Enter new Teaching Subject: ");
            String newTeachingSubject = scanner.nextLine();
            this.setTeachingSubject(newTeachingSubject);

            System.out.println("Teacher updated successfully.");
        } else {
            System.out.println("Teacher ID not found.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Teacher Info:");
        System.out.println("ID: " + getId());
        System.out.println("Full Name: " + getFullName());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Department: " + department);
        System.out.println("Teaching Subject: " + teachingSubject);
        System.out.println("Book Borrow Date: " + getBookBorrowDate());
        System.out.println("Book Return Date: " + getBookReturnDate());
        System.out.println("Book Overdue: " + (isBookOverdue() ? "Yes" : "No"));
    }
}
