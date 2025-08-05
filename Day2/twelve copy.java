public class twelve{
    public static void main(String[] args) {
        System.out.print(series(5));
    }

    public static int series(int n) {
        if (n == 1) {
            return 1;
        }
        return n * series(n - 1);
    }
}