public class Person {
    private String name;
    private int age;

    
    
    public Person(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isAdult() {
        int age = getAge();
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return getName() + "," +getAge();
    }

    public static void main(String[] args) {
        Person p = new Person("Anna", 21);
        System.out.println(p.getAge());
        System.out.println(p.getName());
        p.setAge(17);
        System.out.println(p.isAdult());
        System.out.println(p.toString());
    }
}
