package Day4;

public class four {
    public static void main(String[] args) {
        int res=mul(Add(1,2),Add(2,3));//15
        System.out.print(res);
    }
    public static int mul(int a,int b){
        return a*b;    }
        public static int Add(int a,int b){
            return a+b;
        }
    
}
