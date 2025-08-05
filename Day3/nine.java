public class nine{
    public static void main(String[] args){
        int x=1;
        outer();
    }
    public static void outer(){
        int x=2;
       
        inner(x);
    }
    public static void inner(int x){
        System.out.print(x);//2
    }
}