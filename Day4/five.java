package Day4;

public class five {
    public static void main(String[] args) {
        int a=f(f(f(1)));
        System.out.print(a); // 4
    }
    public static int f(int x){
        return x+1;
    }

}
