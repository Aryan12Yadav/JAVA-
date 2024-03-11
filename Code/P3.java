//  Increamentation and Decrementation

public class P3{

    public static void main(String []args){
    int a = 5;
    a = a+1;
    a++;
    System.out.println(a);


    int b =a;
    b = b-1;
    System.out.println(b);
    System.out.println("\n\n _________________________________\n\n");


    int x = 5;
    int y = x++ + ++x + --x;
    System.out.println(y);

    int p = a++ + ++a + ++a + a++ + --a + a--;
    System.out.println(p);

    }
}