package Day4;

public class seven {
    public static void main(String[] args) {
        System.out.print(mystery(4));//12
    }
    public static int mystery(int x){
        if(x==0) return 1;
        return 2*mystery(x-1);
    }
    
}
