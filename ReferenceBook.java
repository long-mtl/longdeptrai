package assignment14;

import java.util.Scanner;

public class ReferenceBook extends Book {
    private double tax;

    public ReferenceBook() {
        super();
    }

    @Override
    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("tax: ");
        this.tax = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public void updateBook(String id) {
        if (this.bookID.equals(id)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("update tax: ");
            this.tax = Double.parseDouble(scanner.nextLine());
            System.out.println(" update !");
        }
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("tax" + tax);
    }
}
