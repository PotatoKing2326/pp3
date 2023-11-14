public class C2 {
    int counter = 0;

    public void incrase() {
        counter++;
    }

    public void decrase() {
        counter--;
    }

    public void incrase(int n) {
        counter += n;
    }

    public void decrase(int n) {
        counter -= n;
    }

    public int value() {
        return counter;
    }

    public static void main(String[] args) {
        C2 o = new C2();
        System.out.println(o.value());
        o.incrase();
        o.incrase();
        o.decrase();
        o.incrase(5);
        o.decrase(2);
        System.out.println(o.value());
    }
}
