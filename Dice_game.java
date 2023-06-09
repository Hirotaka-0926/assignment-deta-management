import java.util.Random;

class Dice_game{
    public static void main(String[] args){
        Random rand= new Random();
        int sum;
        int Dice1=rand.nextInt(6)+1;
        int Dice2=rand.nextInt(6)+1;
        sum=Dice1+Dice2;
        System.out.println("Die 1:"+Dice1);
        System.out.println("Die 2:"+Dice2);
        System.out.println("Total calue:"+sum);
    }
}