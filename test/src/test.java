import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String str = "ABC DEF HIJ";
        int start = str.lastIndexOf("EF");
        int end = str.lastIndexOf("I");

        String result = str.substring(start, end);
        System.out.println(result);
        System.out.println();
    }
}