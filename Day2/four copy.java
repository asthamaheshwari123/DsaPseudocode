public class four{
    public static void main(String[] args) {
        System.out.print(fact(4));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }
    }
}