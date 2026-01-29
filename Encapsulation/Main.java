class Student {
    private int rollNo;
    private String name;

    public void setRollNo(int r) {
        rollNo = r;
    }
    public int getRollNo() {
        return rollNo;
    }
    public void setName(String n) {
        name = n;
    }
    public String getName() {
        return name;
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setRollNo(101);
        s.setName("Surya");

        System.out.println(s.getRollNo());
        System.out.println(s.getName());
    }
}