public class eight{
    public static void main(String[] args){
        int y=5;
        int z=fun(y);
        System.out.print(y+" "+z);//5 15
    }
    public static int fun(int x){
        int y=x+10;
        return y;
    }
}