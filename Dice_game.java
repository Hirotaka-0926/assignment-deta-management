import java.util.Random;

class Dice_game{
    public static void main(String[] args){
        Random rand = new Random();
        int sum;
        int Die1=rand.nextInt(6)+1;
        int Die2=rand.nextInt(6)+1;
        sum=Die1+Die2;
        System.out.println("Die 1: "+Die1);
        System.out.println("Die 2: "+Die2);
        System.out.println("total Value"+sum);
    }
}