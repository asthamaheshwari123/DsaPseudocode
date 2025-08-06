package Day4;

public class thirteen {
    public static void main(String[] args) {
        System.out.println(funA(4));//8
    }
    public static int funA(int n){
        if(n<=0) return 0;
        return n+funB(n-1);
    }
    public static int funB(int n){
        if(n<=0) return 0;
        return n+funA(n/2);
    }
    
}
