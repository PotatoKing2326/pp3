public class C5 {
    int x;
    int y;

    

    public C5(int x, int y) {
        this.x = x;
        this.y = y;
    }

    boolean isX() {
        if (x == 0) {
            return false;
        } else {
            return true;
        }
    }

    boolean isY() {
        if (y == 0) {
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        return "P("+ x + "," + y +")";
    }

    public static void main(String[] args) {
        C5 o = new C5(3,0);
        System.out.println(o.isX());
        System.out.println(o.isY());
        System.out.println(o.toString());
    }
}
