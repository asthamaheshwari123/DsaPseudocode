public class fifteen{
    public static void main(String[] args) {
      f(8);
    }
    public static void f(int n){
        if(n<1){
            return;
        }
        f(n/2);
        System.out.print(n);
    }

    
}