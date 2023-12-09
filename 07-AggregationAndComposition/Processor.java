public class Processor {
    private String model;
    private double GHz;
    private int cores;
    
    public void setModel(String model) {
        this.model = model;
    }

    public void setGHz(double gHz) {
        this.GHz = gHz;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    public String getModel() {
        return model;
    }

    public double getGHz() {
        return GHz;
    }

    public int getCores() {
        return cores;
    }

    public Processor(String model, double gHz, int cores) {
        this.model = model;
        this.GHz = gHz;
        this.cores = cores;
    }

    public void display() {
        System.out.println("Model: " + getModel() + ", Speed: " + getGHz() + " GHz , Number of cores: " + getCores());
    }

    public static void main(String[] args) {
        Processor processor1 = new Processor("Ryzen 7 5700U", 4, 8);
        processor1.display();
    }
}
