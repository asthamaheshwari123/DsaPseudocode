public class eleven{
    public static void main(String[] args){
        int a=increment(2);
        int b=increment(a);
        System.out.print(b);//4
    }
    public static int increment(int x){
        x=x+1;
        return x;
    }
}