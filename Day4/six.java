package Day4;

public class six {
    public static void main(String[] args) {
        int x=f(3);
        System.out.print(x); // 6
    }
    public static int f(int a){
        if(a==1) return 1;
        return a+f(a-1);
    }
    
}
