package lang.immutable.address;

public class RefMain2 {

    public static void main(String[] args) {
        ImmutableAddress a = new ImmutableAddress("서울"); // x001
        ImmutableAddress b = a; // 참조갑 대입을 막을 수 있는 방법이 없다. x001
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b =  new ImmutableAddress("부산"); // b의 값을 부산으로 변경해야함
        System.out.println("부산 -> b");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
