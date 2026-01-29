class Login {
    private String username = "admin";
    private String password = "12345";

    public boolean validate(String user, String pass) {
        return username.equals(user) && password.equals(pass);
    }
}
public class Main4 {
    public static void main(String[] args) {
        Login l = new Login();

        if (l.validate("admin", "12345")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}