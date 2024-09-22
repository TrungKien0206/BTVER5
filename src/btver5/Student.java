package btver5;

import java.util.Scanner;

class Student extends Person {

    private float gpa;
    private String major;

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        this.id = sc.nextLine();
        System.out.print("Enter Full Name: ");
        this.fullName = sc.nextLine();
        System.out.print("Enter GPA: ");
        this.gpa = sc.nextFloat();
        sc.nextLine();  
        System.out.print("Enter Major: ");
        this.major = sc.nextLine();
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
        System.out.print("Update GPA: ");
        this.gpa = sc.nextFloat();
        sc.nextLine();
        System.out.print("Update Major: ");
        this.major = sc.nextLine();
    }

    @Override
    public void displayInfo() {
        System.out.println("ID: " + this.id);
        System.out.println("Full Name: " + this.fullName);
        System.out.println("GPA: " + this.gpa);
        System.out.println("Major: " + this.major);
    }

    public float getGpa() {
        return gpa;
    }
}
