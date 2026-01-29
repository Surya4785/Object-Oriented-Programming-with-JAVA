class Employee {
    private int empId = 101;

    public int getEmpId() {
        return empId;
    }
}
public class Main3 {
    public static void main(String[] args) {
        Employee e = new Employee();
        System.out.println(e.getEmpId());
    }
}