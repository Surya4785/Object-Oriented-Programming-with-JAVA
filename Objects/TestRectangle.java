class Rectangle {
    int length;
    int breadth;

    void area() {
        System.out.println("Area = " + (length * breadth));
    }
}

public class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();   // Object 1
        Rectangle r2 = new Rectangle();   // Object 2

        r1.length = 5;
        r1.breadth = 4;

        r2.length = 10;
        r2.breadth = 6;

        r1.area();
        r2.area();
    }
}