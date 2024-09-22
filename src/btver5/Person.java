package btver5;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Person implements IPerson {

    protected String id;
    protected String fullName;
    protected Date dateOfBirth;
    protected Date bookBorrowDate;
    protected Date bookReturnDate;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public boolean isBookOverdue() {
        Date today = new Date();
        if (bookReturnDate != null && bookReturnDate.before(today)) {
            System.out.println("Overdue");
            return true;
        } else {
            System.out.println("No overdue");
            return false;
        }
    }
}
