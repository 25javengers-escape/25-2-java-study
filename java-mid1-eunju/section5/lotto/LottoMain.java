package section5.lotto.lang.math.test;

public class LottoMain {
    public static void main(String[] args) {
        Lotto generator=new Lotto();
        int[] lottoNumbers=generator.generate();

        System.out.println("로또 번호: ");
        for (int lottoNumber : lottoNumbers) {
            System.out.println(lottoNumber + " ");

        }

    }
}