public class FlipCoin {
    public static void main(String[] args) {
        int rand = (int)(Math.random()*2);//possible values are 0 and 1
        if (rand == 0)
        {
            System.out.print("heads");
        }
        else if (rand == 1)
        {

            System.out.print("Tails");
        }

    }

}

