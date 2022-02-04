package day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     //  System.out.println("Enter the number");
      //  int n1 = sc.nextInt();
     //   System.out.println("Enter the number");
    //    int n2  = sc.nextInt();
        Calculator cal = new Calculator();
     //   cal.addNumber(n1,n2);
      //  cal.addNumber(45,80);
       // cal.multiplication(50,60);
        cal.division(6000,3000);









    }

     /*  Scanner sc = new Scanner(System.in);//create scanner object
        System.out.println("Enter a number");
        int n1 = sc.nextInt();
        System.out.println("your entered=" + n1);
       System.out.println("Enter a number");
        int n1 = sc.nextInt();
        System.out.println("Enter a number");
        int n2 = sc.nextInt();
       int sum=n1+n2;
        System.out.println("Addition of two numbers " +sum);*/

    //how to create our own method//
   public void addNumber(int x, int y){
          int sum = x+y;
         System.out.println("Addition " +sum) ;

    }
    public void multiplication(int x, int y){
       int mul = x*y;
       System.out.println(mul);
    }
     public void division(int x, int y){
       int div = x/y;
       System.out.println(div);
     }



    }








