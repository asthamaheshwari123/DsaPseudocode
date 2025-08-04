public class eight{
    public static void main(String[] args){
        
    }
    public static void fun(int n){
        if(n==0){
            return;
        }
        fun(n-1);
        fun(n-1);
    }
}