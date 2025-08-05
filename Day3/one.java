public class one{
    public static void main(String[] args){
        int a=5;
        modify(a);
        System.out.println(a);
    }
    public static int modify(int x){
        x=x+10;
        return x;//output:15
    }
}