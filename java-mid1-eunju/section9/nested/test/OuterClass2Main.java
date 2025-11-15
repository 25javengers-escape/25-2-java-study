package section9.nested.test;

public class OuterClass2Main {
    public static void main(String[] args) {
        OuterClass2 outerClass2=new OuterClass2();
        OuterClass2.InnerClass innerClass2=outerClass2.new InnerClass();
        innerClass2.hello();
    }
}
