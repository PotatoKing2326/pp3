public class Library {
    Book[] books = new Book[3];

    public void addBook(Book b, int nr) {
        books[nr] = b;
    }

    public void displayBooks() {
        for (Book b: books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        
    }
}
