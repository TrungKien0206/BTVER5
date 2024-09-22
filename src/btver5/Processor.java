package btver5;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        PersonList personList = new PersonList();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose an option:");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("8. Notify whether the book's return due date has arrived or not");
            System.out.println("9. Exit");
            choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    personList.addStudent();
                    break;
                case 2:
                    personList.addTeacher();
                    break;
                case 3:
                    System.out.print("Enter ID to update: ");
                    String updateId = sc.nextLine();
                    personList.updatePerson(updateId);
                    break;
                case 4:
                    System.out.print("Enter ID to delete: ");
                    String deleteId = sc.nextLine();
                    personList.deletePersonById(deleteId);
                    break;
                case 5:
                    personList.displayEveryone();
                    break;
                case 6:
                    personList.findTopStudent();
                    break;
                case 7:
                    System.out.print("Enter department: ");
                    String department = sc.nextLine();
                    personList.findTeacherByDepartment(department);
                    break;
                case 8:
                    personList.checkBookBorrowing();
                    break;
            }
            System.out.println("-------------------------------");
        } while (choice != 0);
    }
}
