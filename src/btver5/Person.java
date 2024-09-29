package btver5;

import java.text.SimpleDateFormat;
import java.util.Date;

abstract class Person implements IPerson {

    protected String id;
    protected String fullName;
    protected Date dateOfBirth;
    protected Date bookBorrowDate;
    protected Date bookReturnDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Date getBookBorrowDate() {
        return bookBorrowDate;
    }

    public void setBookBorrowDate(Date bookBorrowDate) {
        this.bookBorrowDate = bookBorrowDate;
    }

    public Date getBookReturnDate() {
        return bookReturnDate;
    }

    public void setBookReturnDate(Date bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }

    public SimpleDateFormat getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(SimpleDateFormat dateFormat) {
        this.dateFormat = dateFormat;
    }

    @Override
    public abstract void displayInfo();

    @Override
    public abstract void updatePerson(String id);

    @Override
    public abstract void addPerson();

    
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
