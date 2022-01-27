package Demo;

import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
      System.out.println("enter 1st no");
      num1 = reader.nextDouble();
      
      System.out.println("enter operation");
      op = reader.next().charAt(0);
      
      System.out.println("enter 2nd no");
      num2 = reader.nextDouble();
      switch(op) {
         case '+': ans = num1 + num2;
            break;
         case '-': ans = num1 - num2;
            break;
         case '*': ans = num1 * num2;
            break;
         case '/': ans = num1 / num2;
            break;
      default: System.out.printf("Error! Enter correct operator");
         return;
      }
      System.out.print(" result");
      System.out.println( + ans);
   }
}
