package bai1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
     
            Scanner scanner = new Scanner(System.in) ;
       
            System.out.print("Nhap so nguyen thu nhat: ");
            int num1 = scanner.nextInt();
            
            System.out.print("Nhap so nguyen thu hai: ");
            int num2 = scanner.nextInt();
            
         
            int sum = num1 + num2;
            int difference = num1 - num2;
            int product = num1 * num2;
            int quotient = num1 / num2;
            int remainder = num1 % num2;
            
            
            System.out.println("sum: " + sum);
            System.out.println("difference: " + difference);
            System.out.println("product: " + product);
            System.out.println("quotient: " + quotient);
            System.out.println("remainder: " + remainder);
        
    }
}
