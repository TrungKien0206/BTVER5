package btver5;

import java.util.Scanner;

class Teacher extends Person {

    private String department;
    private String teachingSubject;

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Teacher ID: ");
        this.id = sc.nextLine();
        System.out.print("Enter Full Name: ");
        this.fullName = sc.nextLine();
        System.out.print("Enter Department: ");
        this.department = sc.nextLine();
        System.out.print("Enter Teaching Subject: ");
        this.teachingSubject = sc.nextLine();
        System.out.print("Enter Date of Birth (dd/MM/yyyy): ");
        try {
            this.dateOfBirth = dateFormat.parse(sc.nextLine());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Update Full Name: ");
        this.fullName = sc.nextLine();
        System.out.print("Update Department: ");
        this.department = sc.nextLine();
        System.out.print("Update Teaching Subject: ");
        this.teachingSubject = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Full Name: " + this.fullName);
        System.out.println("Department: " + this.department);
        System.out.println("Teaching Subject: " + this.teachingSubject);
    }

    public String getDepartment() {
        return department;
    }
}
