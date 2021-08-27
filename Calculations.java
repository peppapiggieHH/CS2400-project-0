// Jiyu Liu
// CS1400, section 04
// Project 1 - calculations on integers and strings
// 2021/02/14

import java.util.Scanner;

public class Calculations
{
   public static void main(String[] args)
   {
      Scanner kb = new Scanner(System.in);

      System.out.print("Enter a number: ");
      int firstNumber = kb.nextInt();
      System.out.print("Enter a second number: ");
      int secondNumber = kb.nextInt();
      kb.nextLine();
      System.out.print("Enter a string: ");
      String firstString = kb.nextLine();
      System.out.print("Enter a second string: ");
      String secondString = kb.nextLine();

      int add = firstNumber + secondNumber;
      int minus = firstNumber - secondNumber;
      int multip = firstNumber * secondNumber;
      int divide = firstNumber / secondNumber;
      int mod = firstNumber % secondNumber;
      double divideto = (double)firstNumber / (double)secondNumber;

      String uppercase = firstString.toUpperCase();
      String lowercase = secondString.toLowerCase();
      char ch1 = firstString.charAt(0);
      char ch2 = secondString.charAt(0);
      char ch3 = firstString.charAt(firstString.length()-1);
      char ch4 = secondString.charAt(secondString.length()-1);

      System.out.println(firstNumber + " + " + secondNumber + " = " + add
                         + "\n" + firstNumber + " - " + secondNumber + " = " + minus
                         + "\n" + firstNumber + " * " + secondNumber + " = " + multip
                         + "\n" + firstNumber + " / " + secondNumber + " = " + divide
                         + "\n" + firstNumber + " % " + secondNumber + " = " + mod
                         + "\n" + firstNumber + " / " + secondNumber + " = " + divideto);

      System.out.println("First word, uppercase: " + uppercase
                         + "\n" + "Second word, lowercase: " + lowercase
                         + "\n" + "First characters: " + ch1 + " and " + ch2
                         + "\n" + "Last characters: " + ch3 + " and " + ch4);

}
   }