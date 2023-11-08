public class Statistics {
    static int NumbersOfItems(int x, int y) {
        int numberOFItems = 0;
        for (int i = x; i <= y; i++) {
            numberOFItems++;
        }
        return numberOFItems;
    }

    static int Sum(int x, int y) {
        int sum = 0;
        for (int i = x; i <= y; i++) {
            sum = sum + i;
        }
        return sum;
    }

    static double ArithmeticMean(int x, int y) {
        return (double) Sum(x, y) / NumbersOfItems(x, y);
    }

    static String DisplayStatistics(int x, int y) {
        return "Statistics for range <" + x + ", " + y + ">: Number of items: " + NumbersOfItems(x, y) + " Sum od numbers: " + Sum(x, y) + " Arithmetic mean: " + ArithmeticMean(x, y);
    }

    public static void main(String[] args) {
        System.out.println(DisplayStatistics(5, 10));
    }
}
