// ternary opeator

public class P8 {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int c = 3;



        int res = (a<b) ?a :b;
        String result = (a<b) ? "a is less" : "b is less";
        System.out.print(result);
        System.out.println("\n");
        System.out.println(res);
        



        int val = (a<b)? (a<c ? a : c) : (b<c?b :c);
        System.out.println(val); 


        
    }
    
}
