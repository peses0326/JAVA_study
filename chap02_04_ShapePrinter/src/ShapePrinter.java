public class ShapePrinter {
    public void printTriangle(int height) {
        // 코드를 입력하세요.
        String star = "*";
        for (int i = 1; i <= height; i++) {
            System.out.println(star);
            star += " *";
        }
    }
}