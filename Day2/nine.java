public class nine{
    public static void main(String[] args) {
        System.out.print(sumDigits(1234));
    }

    public static int sumDigits(int n){
        if(n==0){
            return 0;
        }
        return (n%10)+sumDigits(n/10);
    }
}