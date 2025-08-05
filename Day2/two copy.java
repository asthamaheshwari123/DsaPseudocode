public class two {

    public static void main(String[] args) {
        int a=3;
        int b=4;
        System.out.print(mystery(a,b));
    }
    public static int mystery(int a,int b){
        if(b==0){
            return 0;
        }
        return a + mystery(a, b - 1);
    }
}
