public class GreatesAmongThreeNumber {
    public static void main(String[] args) {
        int n1=10,n2=20,n3=30;
        if(n1>=n2 && n1>=n3)
        {
            System.out.println("Greatest Number is "+n1);
        }
        else if (n2>=n1 && n2>=n3)
        {
            System.out.println("Greatest Number is " +n2);
        }
        else if (n3>=n1 && n3>=n2)
        {
            System.out.println("Greatest Number is " +n3);

        }
    }
}
