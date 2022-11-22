import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n,a=0,b=1,temp=0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number; ");
        n = inp.nextInt();
        System.out.print("0 ");

        for (int i = 0; a < n; i++) {
            temp=a+b;
            b=a;
            a=temp;
            System.out.print(a + " ");

        }
    }
}