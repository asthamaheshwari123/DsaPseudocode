public class fourteen{
    public static void main(String[] args){
        System.out.print(rec(4));//12
    }
    public static int rec(int a){
        if(a>10){
            return a;
        }
        return rec(a+2);
    }
}