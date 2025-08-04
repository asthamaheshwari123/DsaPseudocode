public class thirteen{
    public static void main(String[] args) {
       fun(2);
    }

    public static void fun(int n) {
       if(n==0){
        return;
       }
       fun(n-1);
       fun(n-1);
         System.out.print(n + " ");
    }
}