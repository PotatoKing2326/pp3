public class Book {
    private String title;
    private int pages;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        if (pages > 0) {
            this.pages = pages;
        }
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public static void main(String[] args) {
        Book b =new Book();
        b.setTitle("Metro 2033");
        b.setPages(3);
        b.setPages(-4);

        System.out.println(b.getPages());
    }
}
