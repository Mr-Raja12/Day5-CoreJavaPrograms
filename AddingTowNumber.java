import java.util.Scanner;
public class AddingTowNumber {
    public static void main(String[] args) {
        int a,b,c;
        Scanner r= new Scanner(System.in);
        System.out.println("Enter first Number ");
        a=r.nextInt();
        System.out.println("Secound first Number ");
        b=r.nextInt();
        c=a%b;
        System.out.println("Sum of Two Number "+ c);
    }
}
