public class five{
    public static void main(String[] args){
        int x=4;
        x=modify(x);
        System.out.print(x);//8
    }
    public static int modify(int x){
        x=x*2;
        return x;
    }
}