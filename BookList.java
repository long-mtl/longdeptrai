package assignment14;

import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    private ArrayList<Book> bookList;

    public BookList() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(Scanner scanner) {
        System.out.println("Chọn loại sách để thêm:");
        System.out.println("1. Sách giáo khoa (TextBook)| 2. Sách tham khảo (ReferenceBook)");
        int choice = Integer.parseInt(scanner.nextLine());

        Book newBook = null;
        if (choice == 1) {
            newBook = new TextBook();
        } else if (choice == 2) {
            newBook = new ReferenceBook();
        } else {
            System.out.println(" khong hop le");
            return;
        }

        newBook.addBook();
        bookList.add(newBook);
        System.out.println(" Đã thêm sách thành công!");
    }

    public void updateBook(String id, Scanner scanner) {
        for (Book book : bookList) {
            if (book.getBookID().equals(id)) {
                book.updateBook(id);
                System.out.println(" Đã cập nhật thông tin sách!");
                return;
            }
        }
        System.out.println(" Không tìm thấy sách có ID: " + id);
    }

    public void deleteBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookID().equals(id)) {
                bookList.remove(book);
                System.out.println(" Đã xóa sách có ID: " + id);
                return;
            }
        }
        System.out.println(" Không tìm thấy sách có ID: " + id);
    }

    public Book findBookById(String id) {
        for (Book book : bookList) {
            if (book.getBookID().equals(id)) {
                return book;
            }
        }
        System.out.println("⚠ Không tìm thấy sách có ID: " + id);
        return null;
    }

    public void displayAllBooks() {
        if (bookList.isEmpty()) {
            System.out.println(" Danh sách trống!");
        } else {
            System.out.println(" Danh sách hiện có:");
            for (Book book : bookList) {
                book.displayBook();
            }
        }
    }
}
