package Section4;

public class TestString4 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String filename = str.substring(0, 5);
        System.out.println("filename = " + filename);
        String extname = str.substring(6);
        System.out.println("extname = " + extname);
    }
}