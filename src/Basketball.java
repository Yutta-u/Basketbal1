import java.util.Scanner;

public class Basketball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int a1 = scan.nextInt();
        int b = scan.nextInt();
        int b1 = scan.nextInt();

        int c = scan.nextInt();
        int c1 = scan.nextInt();
        int d = scan.nextInt();
        int d1 = scan.nextInt();

        if (a+b+c+d==a1+b1+c1+d1) {
            System.out.println("DRAW");
        } else if (a+b+c+d>a1+b1+c1+d1) {
            System.out.println(1);
        }else if (a+b+c+d<a1+b1+c1+d1){
            System.out.println(2);
        }
    }
}
