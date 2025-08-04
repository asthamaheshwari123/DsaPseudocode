public class three{
    public static void main(String[] args) {
        System.out.print(f(6));
    }
    public static int f(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+f(n-2);
        }
    }

    
}