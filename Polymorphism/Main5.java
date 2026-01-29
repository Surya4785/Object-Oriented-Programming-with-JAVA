interface Payment {
    void pay();
}
class UPI implements Payment {
    public void pay() {
        System.out.println("Payment via UPI");
    }
}
class Card implements Payment {
    public void pay() {
        System.out.println("Payment via Card");
    }
}
public class Main5 {
    public static void main(String[] args) {
        Payment p;
        p = new UPI();
        p.pay();
        p = new Card();
        p.pay();
    }
}