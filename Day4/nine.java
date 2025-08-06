package Day4;

public class nine {
    public static void main(String[] args) {
        int res=call(call(call(0)));
        System.out.print(res);//6
    }
    public static int call(int x){
        return x+2;
    }
    
}
