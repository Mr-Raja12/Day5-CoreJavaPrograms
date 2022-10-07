import java.util.Scanner;
public class OddOrEven {
    public static void main(String[] args) {
        int number;
        //checking whether the number is even or odd
        Scanner r= new Scanner(System.in);
        System.out.println("Enter a Number ");
        number=r.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " is Even");
        else
            System.out.println(number + " is odd");
    }
}

