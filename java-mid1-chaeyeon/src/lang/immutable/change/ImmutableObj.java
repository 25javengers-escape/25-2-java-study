package lang.immutable.change;

public class ImmutableObj {

    private final int value;

    public ImmutableObj(int value) {
        this.value = value;
    }

    public ImmutableObj add(int addValue) {
        int result = this.value + addValue;
        return new ImmutableObj(result);
        //기존 객체의 값을 변경하면 안되므로 계산 결과를 기반으로 새로운 객체를 만들어서 반환
    }
    public int getValue() {
        return value;
    }
}
