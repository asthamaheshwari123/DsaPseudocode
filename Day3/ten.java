public class ten{
    public static void main(String[] args){
        int x=10;
        show();
    }
    public static void show(){
        System.out.print(x);
        int x=20;//this line will give error
    }
}