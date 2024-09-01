import java.util.Scanner;
public class IT24101984Lab6Q2C  {
public static void main(String[] args)  {

 Scanner input = new Scanner(System.in);

//Declare Variables
 
 int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10;
 int sum;
 double avg;

  
 
 System.out.print("Enter a number : ");
   num1 = input.nextInt();
 
   System.out.print("Enter a number : ");
   num2= input.nextInt();
  
  System.out.print("Enter a number : ");
   num3= input.nextInt();

  System.out.print("Enter a number : ");
   num4= input.nextInt();

 System.out.print("Enter a number : ");
   num5= input.nextInt();


 System.out.print("Enter a number : ");
   num6= input.nextInt();

System.out.print("Enter a number : ");
   num7= input.nextInt();

  System.out.print("Enter a number : ");
   num8= input.nextInt();

  System.out.print("Enter a number : ");
   num9= input.nextInt();

  System.out.print("Enter a number : ");
   num10 = input.nextInt();



//Calculate the sum and average
sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
 avg = sum / 10;

//Print inpurt numbers

  System.out.println("\n");
  System.out.println("The numbers you enterd are : ");
  System.out.println(num1 + " " + num2 + " " + num3 + " "+ num4 + " " + num5 + " " + num6 + " " + num7 + " " + num8 + " " + num9 + " " + num10);

  System.out.print("\n");

  System.out.println("Sum of the nummbers : " + sum);

  System.out.println("\n");
  System.out.print("Average of the numbers : " + avg);



  }
}
