import java.util.Scanner;
public class IT24101984Lab6Q1  {
public static void main(String[] args)  {

  Scanner input = new Scanner(System.in);

 int num;
 double square, squareRoot,sqrt;

//Get user inputs
System.out.print("Enter a number : ");
num = input.nextInt();

System.out.print("\n");

//Calculations
square = num * num;
squareRoot = Math.sqrt(num);

//Display the output
 System.out.println("Square of "+ num + " is : " + square);
 System.out.print("Square Root of " + num + " is : " + squareRoot);


  }
}