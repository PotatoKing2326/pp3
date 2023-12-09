public class Ebook extends Book {
    private String filename;
    
    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public Ebook(String Title, String Author, String filename) {
        super(Title, Author);
        this.filename = filename;
    }

    public void display() {
        System.out.println("Title: " + getTitle() + ", Author: " + getAuthor() + ", File name: " + getFilename());
    } 
    
    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Metro 2033", "Dimitry Glukhowsky", "metro2033.epub");
        Ebook ebook2 = new Ebook("Altered Carbon","Morgan Richard", "altered_carbon.epub");
        
        ebook1.display();
        ebook2.display();
    }
}

    
