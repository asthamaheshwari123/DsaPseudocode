public class fourteen{
    public static void main(String[] args) {
        System.out.print(product(123));
    }
    public static int product(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*product(n/10);
    }

    
}