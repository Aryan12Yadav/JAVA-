// SWTICH CASE

public class P9 {
    public static void main(String []args) {
    int num = 300;

    switch (num){
        case 300 : System.out.println("case 1");
        case 200 : System.out.println("case 2");
        case 100 : System.out.println("case 3\n\n\n");
        
    }

    switch (num){
        case 300 : System.out.println("case 1");
        break;
        case 200 : System.out.println("case 2");
        break;

        case 100 : System.out.println("case 3");
        break;
        
        default : System.out.println("not match ");

    }
    }
}
