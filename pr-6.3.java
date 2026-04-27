import java.util.Scanner;
class BookNotAvailableException extends Exception {
    public BookNotAvailableException(String message) {
        super(message);
    }
}
class Library {
    private int availableBooks;

    public Library(int availableBooks) {
        this.availableBooks = availableBooks;
    }

    public void issueBook(int count) throws BookNotAvailableException {

        if (count <= availableBooks) {
            availableBooks -= count;
            System.out.println("Book issued successfully");
            System.out.println("Remaining books: " + availableBooks);
        } else {
            throw new BookNotAvailableException("Requested books not available");
        }
    }
}
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library lib = new Library(3);

        try {
            System.out.print("Enter number of books to issue (1st request): ");
            int firstRequest = sc.nextInt();
            lib.issueBook(firstRequest);

            System.out.print("\nEnter number of books to issue (2nd request): ");
            int secondRequest = sc.nextInt();
            lib.issueBook(secondRequest);

        } 
        catch (BookNotAvailableException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } 
        finally {
            System.out.println("\nLibrary transaction completed.");
            sc.close();
        }
    }
}
/*output:
Enter number of books to issue (1st request): 2
Book issued successfully
Remaining books: 1

Enter number of books to issue (2nd request): 2
Exception: Requested books not available*/