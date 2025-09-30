package lang.wrapper.test;

public class WrapperTest2 {
    public static void main(String[] args) {
        String[] array = {"1.5", "2.5", "3.0"};

        //코드 작성
        double arr1 = Double.parseDouble(array[0]);
        double arr2 = Double.parseDouble(array[1]);
        double arr3 = Double.parseDouble(array[2]);

        double sum = arr1 + arr2 + arr3;

        System.out.println("sum = " + sum);
    }
}
