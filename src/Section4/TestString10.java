package Section4;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        for (String s : fruits.split(",")) {
            System.out.println(s);
        }
        String joinedString = String.join("->", fruits.split(","));
        System.out.println("joinedString = " + joinedString);
    }
}
