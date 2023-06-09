import java.util.Random;
import java.util.Scanner;

class Dice_game{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("What is your name? ");
        String name=sc.next();

        System.out.println("Hello , "+name);
        Random rand = new Random();
        int sum;
        int Die1=rand.nextInt(6)+1;
        int Die2=rand.nextInt(6)+1;
        sum=Die1+Die2;
        System.out.println("Die 1: "+Die1);
        System.out.println("Die 2: "+Die2);
        System.out.println("total Value "+sum);

        if(sum<=7)System.out.println(name+" lose");
        else System.out.println(name+" won");
        
    }
}