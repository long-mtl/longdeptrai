package assignment14;

import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BookList bookList = new BookList();

        while (true) {
            System.out.println("1.them sach");
            System.out.println("2.cap nhat sach");
            System.out.println("3.xoa sach");
            System.out.println("4. tim sach");
            System.out.println("5. danh sach sach");
            System.out.println("0️. thoat");
            
            
            int choice;
            try {
                choice = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("khong hop le");
                continue;
            }

            switch (choice) {
                case 1:
                    bookList.addBook(scanner);
                    break;
                case 2:
                    System.out.print("Nhập ID sách cần cập nhật: ");
                    String updateId = scanner.nextLine();
                    bookList.updateBook(updateId, scanner);
                    break;
                case 3:
                    System.out.print("Nhập ID sách cần xóa: ");
                    String deleteId = scanner.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;
                case 4:
                    System.out.print("Nhập ID sách cần tìm: ");
                    String findId = scanner.nextLine();
                    Book foundBook = bookList.findBookById(findId);
                    if (foundBook != null) {
                        foundBook.displayBook();
                    }
                    break;
                case 5:
                    bookList.displayAllBooks();
                    break;
                case 0:
                    System.out.println(" exit");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println(" khong hop le");
            }
        }
    }
}
