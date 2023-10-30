public class Student {

    String name;
    int age;
    int id;
    boolean idValid;
    int semesterNumber;
    float averageGrade;

    void sayHello(){
        System.out.println("Hello from " + this.name);
    }

    void displayName(){
        System.out.println("Name of student: " + name);
    }

    void displayAge(){
        System.out.println("Age of student: " + age);
    }

    void displayInfo(){
        System.out.println("Student name: " + name + ", semester number: " + semesterNumber + ", average grade: " + averageGrade);
    }

    void status(){
        if (idValid == true){
            idValid = false;
        }else{
            idValid = true;
        }
    }

    void displayIdInfo(){
        System.out.println("Student Name: " + name);
        System.out.println("Student ID card number: " + id);
        System.out.println(idValid == true ? "Student card is valid" : "Student card is invalid");
    }
}