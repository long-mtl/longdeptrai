package assignment14;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public abstract class Book implements IBook {

    String bookID;
    String publisher;
    Date entryDate;
    double unitPrice;
    double quantity;
    public Book() {
        this.bookID = bookID;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public Book(String bookID, String publisher, Date entryDate, double unitPrice, double quantity) {
        this.bookID = bookID;
        this.publisher = publisher;
        this.entryDate = entryDate;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public void addBook() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("bookID:");
        bookID = scanner.nextLine();
        System.out.print("publisher:");
        publisher = scanner.nextLine();
        System.out.print("entryDate:");
        String dateInput = scanner.nextLine();
        entryDate = java.sql.Date.valueOf(dateInput);
        System.out.print("unitPrice:");
        unitPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("quantity:");
        quantity = Double.parseDouble(scanner.nextLine());

    }
    public void displayBook(){
        System.out.print("bookID " + bookID);
        System.out.print("publisher " + publisher);
        System.out.println("entryDate " + entryDate);
        System.out.println("unitPrice " + unitPrice);
        System.out.println("quantity " + quantity);
    }

    Object getBookID() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

}
