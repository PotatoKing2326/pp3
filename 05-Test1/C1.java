public class C1 {
    private String name;
    private int age;
    public C1(String name, int age) {
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
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return name + "," + age;
    }

    public static void main(String[] args) {
        C1 o = new C1("Anna", 21);
        System.out.println(o.getAge());
        System.out.println(o.isAdult());
        o.setAge(17);
        System.out.println(o.isAdult());
        System.out.println(o.toString());
    }
    
}