public class seven{
    public static void main(String[] args){
        System.out.print(fun(5));
    }
    public static int fun(int n){
        if(n<=1){
            return n;
        }
        return fun(n-1)+fun(n-3);
    }
}