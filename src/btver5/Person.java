package btver5;

import java.util.Date;

public abstract class Person implements IPerson {

    private String id;
    private String fullName;
    private Date dateOfBirth;
    private Date bookBorrowDate;
    private Date bookReturnDate;

    // Constructor
    public Person(String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        this.id = id;
        this.fullName = fullName;
        this.dateOfBirth = dateOfBirth;
        this.bookBorrowDate = bookBorrowDate;
        this.bookReturnDate = bookReturnDate;
    }

    // Getters and Setters
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

    // Check if book is overdue
    public boolean isBookOverdue() {
        long differenceInMillies = bookReturnDate.getTime() - bookBorrowDate.getTime();
        long differenceInDays = differenceInMillies / (1000 * 60 * 60 * 24);
        return differenceInDays >= 30;
    }

    // Abstract methods to be implemented by subclasses
    @Override
    public abstract void addPerson();

    @Override
    public abstract void updatePerson(String id);

    @Override
    public abstract void displayInfo();
}
