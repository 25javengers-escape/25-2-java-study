package lang.wrapper.test;

public class WrapperTest4 {
    public static void main(String[] args) {
        String str = "100";

        //코드 작성
        Integer integer1 = Integer.valueOf(str);
        System.out.println("integer1 = " + integer1);

        int intValue = Integer.parseInt(str);
        System.out.println("intValue = " + intValue);

        Integer integer2 = Integer.valueOf(str);
        System.out.println("integer2 = " + integer2);

    }
}
