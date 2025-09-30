package lang.wrapper.test;

public class WrapperTest3 {

    public static void main(String[] args) {
        String str = "100";

        //코드 작성
        Integer int1 = Integer.valueOf(str);
        System.out.println("integer1 = " + int1);

        int int2 = Integer.parseInt(str);
        System.out.println("intValue = " + int2);

        Integer int3 = Integer.valueOf(str);
        System.out.println("integer2 = " + int3);
    }
}
