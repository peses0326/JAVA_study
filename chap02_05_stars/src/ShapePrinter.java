public class ShapePrinter {
    public void printPyramid(int height) {
        // 코드를 입력하세요.
        String star = "*";
        for (int i = 1; i <= height; i++) {
            String blk = "";
            for (int j = i; j < height; j++) {
                blk += " ";
            }
            System.out.print(blk);
            System.out.println(star);
            star += "**";
        }
    }

    public static void main(String[] args) {
        ShapePrinter printer = new ShapePrinter();

        // 테스트
        printer.printPyramid(3);
        System.out.println("----------");
        printer.printPyramid(5);
        System.out.println("----------");
        printer.printPyramid(10);
    }
}