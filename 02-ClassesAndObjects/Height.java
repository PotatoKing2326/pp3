public class Height {
    public static void main(String[] args) {
        int cm = 185;
        double in = cm/2.54;
        int ft = (int)in/12;
        double rin = in - ft*12;
        
        System.out.println("I am " + cm + "cm tall, i. e. " + ft + " feet and " + String.format("%.2f", rin) + " inches");
    }
}
