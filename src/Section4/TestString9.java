package Section4;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";

        String ID = email.split("@")[0];
        System.out.println("ID = " + ID);
        String domain = email.split("@")[1];
        System.out.println("domain = " + domain);

    }
}