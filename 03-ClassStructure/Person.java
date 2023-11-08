public class Person {
    String name;
    float weight;
    int height;
    public Person(String name) {
        this.name = name;
    }

    public Person(String name, float weight, int height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(float weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI(float weight, int height) {
        float heightInM = height / 100.0f;
        double power = (Math.pow(heightInM, 2))*1.0f;
        return weight / power;
    }

    public String displayRecord() {
        String bmiStatus = (calculateBMI(weight, height) < 18.5) ? "BMI too low" : (calculateBMI(weight, height) > 24.9) ? "BMI too high" : "BMI correct";
        return "Person info:\nName: " + name + "\nWeight: " + weight + "\nHeight: " + height + "\nBMI:" + calculateBMI(weight, height) + ", " + bmiStatus;
    }

    public static void main(String[] args) {
        Person Jacek = new Person("Jacek", 80, 180);
        System.out.println(Jacek.displayRecord());

        Person Maciek = new Person("Maciek");
        Maciek.setWeightAndHeight(100, 185);
        System.out.println(Maciek.displayRecord());
    }
}
