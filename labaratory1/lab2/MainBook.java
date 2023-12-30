package labatory1.lab2;

public class MainBook {
    public static void main(String[] args) {

        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, Book.Genre.FICTION);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 1960, Book.Genre.FICTION);


        System.out.println("Book 1:\n" + book1);
        System.out.println("\nBook 2:\n" + book2);
    }
}
