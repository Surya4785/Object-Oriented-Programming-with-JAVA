interface Bank {
    void rateOfInterest();
}

class SBI implements Bank {
    public void rateOfInterest() {
        System.out.println("SBI Interest Rate is 6.5%");
    }
}

public class Main2 {
    public static void main(String[] args) {
        Bank b = new SBI();
        b.rateOfInterest();
    }
}
