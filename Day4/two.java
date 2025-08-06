package Day4;

public class two {
    public static void main(String[] args){
        int res=square(square(2));
        System.out.print(res);
    }
    public static int square(int x){
        return x*x;
    }

}
