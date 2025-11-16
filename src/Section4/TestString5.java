package Section4;

public class TestString5 {
    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        String filename = str.substring(0, 5);
        System.out.println("filename = " + filename);
        System.out.println("extName = " + ext);
    }
}