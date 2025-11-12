package lang.immutable.address;

public class ImmutableAddress {

    private final String value; //내부 값이 변경되면 안 돼서 final로 선언

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    //값이 변경되는 setValue()도 삭제

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
