interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllInOne implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class Main3 {
    public static void main(String[] args) {
        AllInOne device = new AllInOne();
        device.print();
        device.scan();
    }
}
