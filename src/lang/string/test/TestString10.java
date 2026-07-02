package lang.string.test;

public class TestString10 {

    public static void main(String[] args) {
        String fruits = "apple,banana,mango";

        String[] strSplit = fruits.split(",");
        for (String fruit : strSplit) {
            System.out.println(fruit);
        }

        String strJoin = String.join("->", strSplit);
        System.out.println("strJoin = " + strJoin);
    }
}
