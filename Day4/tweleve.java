package Day4;

public class tweleve {
    public static void main(String[] args) {
        System.out.println(decide(3)+decide(6));//15
    }
    public static int decide(int a){
        if(a>5) return 10;
        return 5;
    }
    
}
