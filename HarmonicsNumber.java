import java.util.Scanner;
public class HarmonicsNumber {
    public static void main(String[] args) {
        System.out.print("Enter a Number");
        Scanner in = new Scanner(System.in);
        int num= in.nextInt();
        double result=0.0;
        for(int i=num; i>0; i--)
        {
            result = result + (double)1/i;
            System.out.print(result +", ");
        }

    }
}

//LOGIC

//H1=1
//H2=H1+1/2
//H3=H2+1/3
//H4=H3+1/4
//H5=H4+1/5
//.
//.
//Hn = Hn-1 +1/n

    /*If n = 4, then

Hn = 1 + 1/2 + 1/3 + 1/4 = 2.083333*/