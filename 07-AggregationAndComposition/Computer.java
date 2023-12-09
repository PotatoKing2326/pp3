public class Computer {
    private String brand;
    private String model;
    private Processor processor;

    public Computer(String brand, String model) {
        this.brand = brand;
        this.model = model;
        this.processor = new Processor("Ryzen 7 5700U", 4, 8);
    }

    

}