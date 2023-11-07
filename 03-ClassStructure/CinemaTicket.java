public class CinemaTicket {
    static String cinemaName = "Morning Star Cinema";
    String filmTitle;
    int row;
    int seat;
    double price;

    public CinemaTicket(String filmTitle, int row, int seat, double price) {
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        this.price = price;
    }

    public CinemaTicket(String filmTitle,int row, int seat){
        this.filmTitle = filmTitle;
        this.row = row;
        this.seat = seat;
        this.price = (row <= 2) ? 10 : 25;
    }

    public String toString(){
        return "Ticket info: Cinema Name: " + cinemaName + ", film title: " + filmTitle + ", row: " + row + ", seat: " + seat + ", price: " + price;
    }

    public static void main(String[] args) {
        CinemaTicket Ticket1 = new CinemaTicket("Hobbit", 2, 12, 22.5);
        CinemaTicket Ticket2 = new CinemaTicket("Inception", 13, 13, 13.99);

        System.out.println(Ticket1);
        System.out.println(Ticket2);

        CinemaTicket GlatiatorCheap = new CinemaTicket("Gladiator", 2, 20);
        CinemaTicket GladiatorExpencive = new CinemaTicket("Gladiator", 10, 10);

        System.out.println(GlatiatorCheap);
        System.out.println(GladiatorExpencive);
    }
}
