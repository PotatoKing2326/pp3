public class StudentTest {
    public static void main(String[] args) {
        //object creation
        Student s = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);


        Student a = new Student();
        a.name = "Adam";
        a.age = 22;
        
        Student b = new Student();
        b.name = "Bartłomiej";
        b.age = 23;

        Student c = new Student();
        c.name = "Czarek";
        c.age = 24;

        a.sayHello();
        a.displayAge();
        a.displayName();      

        b.sayHello();
        b.displayAge();
        b.displayName();
    }
}