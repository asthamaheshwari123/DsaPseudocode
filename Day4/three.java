package Day4;

public class three {
    public static void main(String[] args) {
        System.out.print(foo(4));//24
    }
    public static int foo(int x){
        if(x==0) return 1;
        return x*foo(x-1);
    }
    
}
