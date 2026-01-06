class Student {
    int id;
    String name;

    void display() {
        System.out.println("ID: " + id + ", Name: " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();   
        Student s2 = new Student();   

        s1.id = 101;
        s1.name = "Surya";

        s2.id = 102;
        s2.name = "Aman";

        s1.display();
        s2.display();
    }
}