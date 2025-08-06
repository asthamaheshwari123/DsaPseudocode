package Day4;

public class fifteen {
    public static void main(String[] args){
        System.out.println(f(7));

    }
    public static int f(int x){
        return x%2==0?x:f(x-1);
    }
    
}
