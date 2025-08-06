package Day4;

public class eight {
    public static void main(String[] args) {
        int x=3;
        int y=process(process(x));
        System.out.print(y);//12
    }
    public static int process(int x){
        return x*2;
    }
    
}
