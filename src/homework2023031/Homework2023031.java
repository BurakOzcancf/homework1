/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework2023031;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Homework2023031 {

    public static void main(String[] args) {
        
        // Q1        
        while(true){
            try{
                System.out.println("Hello! In this programme, I am returning the bigger number between two numbers"); // Programme is explained
                System.out.println("Please give 2 numbers");
                System.out.print("Number 1: "); // First input is asked
                Scanner scanner=new Scanner(System.in); // Scanner is opened to have input from users
                int number1=scanner.nextInt(); // number1 is assigned 
                System.out.print("Number 2: "); // Second input is asked
                int number2=scanner.nextInt(); // number2 is assigned
                
                // Here is the logic part.
                if(number1>number2) System.out.println(number1+" is bigger than "+number2);
                if(number2>number1) System.out.println(number2+" is bigger than "+number1); 
                else System.out.println("The numbers are the same");
                
                break;
            }catch (InputMismatchException e) {
                // If the user puts different types than int, here will catch and return a message
                System.out.println("Please type a number");
                continue;
            }
        }
        
        // Q2
        while(true){
            try{
                System.out.println("Please give a number for odd or even"); // Programme is explained
                Scanner scanner=new Scanner(System.in); // Scanner is opened to have input from users
                int isOdd=scanner.nextInt(); // Number is assigned
                System.out.print(isOdd+" is an ");
                String result=isOdd%2==0?"Even number":"Odd number"; // Ternary operation (logic part)
                System.out.println(result); 
                break;
            }catch (InputMismatchException e) {     
                // If the user puts different types than int, here will catch and return a message
                System.out.println("Please type a number");
            continue;
            }
        }
        
        //Q3
        while(true){
            try{
                Scanner scanner=new Scanner(System.in); // Scanner is opened to have input from users
                System.out.println("Please enter the mark you have received to see the effects on total result."); // Programme is explained
                double mark=scanner.nextInt(); // Number is assigned
                
                // Here is the logic part
                if(mark>=0 && mark<=100 ) {
                    double yourMark=(mark/4);
                    System.out.println("You scored "+yourMark+"% out of maximum 25%");
                    break;
                }
                else System.out.println("Mark must be between 0 to 100");
                continue;
            }catch (InputMismatchException e) {
                // If user put different type than int, here will catch
                System.out.println("Please type a number");}
            continue;
        }
    }
}