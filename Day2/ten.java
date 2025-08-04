public class ten{
    public static void main(String[] args){
        reversePrint(3);
    }
    public static void reversePrint(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        reversePrint(n - 1);
    }
}