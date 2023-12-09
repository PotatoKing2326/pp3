public class Audiobook extends Book{
    private int minutes;
    private int seconds;

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void display() {
        System.out.println("Title: " + getTitle() + ", Author: " + getAuthor() + ", Minutes: " + getMinutes() + ", Seconds: " + getSeconds());
    }

    public static void main(String[] args) {
        Audiobook a1 = new Audiobook("Metro 2033", "Dimitry Glukhowsky", 100, 20);
        Audiobook a2 = new Audiobook("Altered Carbon","Morgan Richard", 150, 30);
        
        a1.display();
        a2.display();
    }
}
