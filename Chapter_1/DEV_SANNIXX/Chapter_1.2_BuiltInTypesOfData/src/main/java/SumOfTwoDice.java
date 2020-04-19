public class SumOfTwoDice {

    public static void main(String[] args) {
        int max_random = 6;
        // Math.random trả về 1 float có giá trị từ (0 đến dưới 1).
        int sum = (int) (Math.random() * max_random + Math.random() * max_random);
        // In ra màn hình console - terminal tổng 2 số random 0 - 6.
        System.out.printf("Total: %d",sum);
    }
}
