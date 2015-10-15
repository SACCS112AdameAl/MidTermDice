import java.util.Random;
import java.util.Scanner;

public class Dice {
	private final int SIDES;

	
	public Dice(int sides){
	 
	    SIDES = sides;
	}

	

	public int roll(){

	    Random rnd = new Random();

	    return rnd.nextInt(SIDES) + 1;
	}

	
public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);

    Dice d1 = new Dice(6);
    Dice d2 = new Dice(6);
    Dice d3 = new Dice(6);

    boolean playing = true;

    while(playing) {


    int res1, res2, res3;

    res1 = d1.roll();
    res2 = d2.roll();
    res3 = d3.roll();

     System.out.println("Roll results: dice 1 = " + res1 +
            "; dice 2 = " + res2 + "; dice 3 = " + res3);



    int oddNumbersPoints = ((res1 * (res1%2))+(res2 * (res2 % 2))+( res3 * (res3 % 2)));

    int evenNumbersPoints = ((res1 * ((res1 + 1) %2)) + (res2 * ((res2+1) % 2))+( res3 * ((res3+1) % 2)));

    

  
    System.out.println("Even Numbers Points: " + evenNumbersPoints);
    System.out.println("Odd Numbers Points: " + oddNumbersPoints);
    System.out.println("Do you wish to play again? Y/N");
    String answer = input.nextLine();
    playing = answer.equalsIgnoreCase("y");
  
}
}}