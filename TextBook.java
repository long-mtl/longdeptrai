package assignment14;

import java.util.Scanner;

public class TextBook extends Book {
    private String status;

    public TextBook() {
        super();
    }
    

    @Override
    public void addBook() {
        super.addBook();
        Scanner scanner = new Scanner(System.in);
        System.out.print("status: ");
        this.status = scanner.nextLine();
    }

    @Override
    public void updateBook(String id) {
        if (this.bookID.equals(id)) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("status: ");
            this.status = scanner.nextLine();
            System.out.println("da cap nhat SGK!");
        }
    }

    @Override
    public void displayBook() {
        super.displayBook();
        System.out.println("status" + status);
    }
}
