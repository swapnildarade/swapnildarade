package Demo;

import java.util.Scanner;

public class Calculator {
   public static void main(String[] args) {
      double num1;
      double num2;
      double ans;
      char op;
      Scanner reader = new Scanner(System.in);
     
      num1 = reader.nextDouble();
      
   
      op = reader.next().charAt(0);
      
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