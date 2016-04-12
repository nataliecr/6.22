import java.util.Scanner;

public class SquareRoot {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    double n = input.nextDouble();
    
    System.out.println("The square root is " + sqrt(n));
  } // main
  
  public static double sqrt(double n){
    double lastGuess = 1, nextGuess = 1;
    
    do{
      lastGuess = nextGuess;  
      nextGuess = (lastGuess + (n / lastGuess)) / 2;
    } while (Math.abs(nextGuess - lastGuess) >= .0001);
      
    return nextGuess;
  } // sqrt
} // class SquareRoot
