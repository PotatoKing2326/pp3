public class Product {
    private String name;
    private boolean isVegetarian;

    public void setName(String name) {
        this.name = name;
    }

    public void setIsVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public boolean getIsVegetarian() {
        return isVegetarian;
    }

    public static void main(String[] args) {
        Product mleko = new Product();
        mleko.setName("Mleko");
        mleko.setIsVegetarian(false);

        System.out.println("Name: " + mleko.getName() + ", Is vegetarian: " + mleko.getIsVegetarian());
    }
}
