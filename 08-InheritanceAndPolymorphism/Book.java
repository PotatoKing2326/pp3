public class Book {
    private String title;
    private String author;
    
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void display() {
        System.out.println("Title: " + getTitle() + ", Author: " + getAuthor());
    }

    public static void main(String[] args) {
        Book book1 = new Book("Metro 2033","Dimitry Glukhowsky");
        Book book2 = new Book("Altered Carbon","Morgan Richard");

        book1.display();
        book2.display();
    }
    
}