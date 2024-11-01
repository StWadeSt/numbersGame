import java.util.Random;
import java.util.Scanner;
public class App {
    static Scanner scanner = new Scanner(System.in);
    static int count=0;

    public static void main(String[] args) throws Exception {
        
        Random random = new Random();
        int randNum = random.nextInt(100);
        System.out.println(randNum);

        for (int i = 0; i < 3; i++) {
            System.out.println("Round "+(i+1)+": ");

            play(randNum);
        }
        System.out.println("Game Over!!");
        System.out.println("Your score: "+ count);
        
    }
    public static  int play(int randNum){
        for (int i = 0; i < 5; i++) {
            System.out.println("Guess the number: ");
            int userInput = Integer.parseInt(scanner.nextLine());

            if(userInput > randNum){
                System.out.println("Lower");
            }
            else if(userInput < randNum){
                System.out.println("Higher");
            }
            else if (userInput == randNum){
                System.out.println("Thats correct! ");
                count++;
                break;
            }
            
        }
        return count;
    }
}
