public class eleven{
    public static void main(String[] args) {
    System.out.print(foo(4));
}
public static int foo(int n){
    if(n==1){
        return 1;
    }
    return foo(n-1)+foo(n-2);
}
}