public class six{
    public static void main(String[] args) {
     System.out.print(fun(3));

    }
    public static int fun(int x){
        if(x==0){
            return 0;
        }
        return fun(x-1);
    }
}