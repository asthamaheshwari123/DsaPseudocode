public class fifteen{
    public static void main(String[] args){
        int x=3;
        int y=5;
        f(x,y);
        System.out.print(x+" "+y); //3 5
    }
    public static void f(int a,int b){
        a=a+b;//8
        b=a-b;//5
        a=a-b;//3
        System.out.print(a+" "+b); //3 5
    }
}