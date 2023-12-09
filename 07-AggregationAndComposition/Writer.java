public class Writer {
    private String name;
    private String surname;
    private Book book;

    
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }


    public Writer(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.book = book;
    }

    public void display() {
        System.out.println("Writer: " + getName() + " " + getSurname() + ", book: " + toString());
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Dimitry", "Glukhowsky");
        w1.display();
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Book getBook() {
        return book;
    }
    
}
