public class Excersice43 {
    public static void main(String[] args) {

        double dice1 = 0;
        double dice2 = 0;
        int rolls = 0;
        int sum = 0;

        while (sum != Math.random() * 5 + 2){
            dice1 = (Math.random()) * (6);
            dice1 = Math.ceil(dice1);

            dice2 = (Math.random()) * (6);
            dice2 = Math.ceil(dice2);

            sum = (int) (dice1 + dice2);
            System.out.println("You rolled " + sum);
            rolls ++;
        }
        System.out.print("It took " + rolls + " rolls to get the sum of " + sum);
    }
}
