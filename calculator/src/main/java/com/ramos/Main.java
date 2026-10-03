package com.ramos;
import java.util.Scanner;

/**
 * @author Francis Enrico G. Ramos
 */
public class Main {
    public static String[] options = 
    {
              "Addition", 
           "Subtraction", 
        "Multiplication", 
              "Division", 
                  "Exit",
    };
    
    public static boolean     stop = false;
    public static Scanner     scan = 
    new Scanner(System.in);
    public static String  selected;

    public static int      auguend;
    public static int       addend;
    public static int          sum;

    public static int      minuend;
    public static int   subtrahend;
    public static int   difference;

    public static int multiplicand;
    public static int   multiplier;
    public static int      product;

    public static int     dividend;
    public static int      divisor;
    public static String  quotient;

    public static void main(String[] args) 
    {
        do 
        {
            clear(); for (int i = 0; i < options.length; i++)
            {
                String option = "%d. %s"
                .formatted(i + 1, options[i]);

                System.out.println(option);
            }


            System.out.print("What do you want to do? ");
            selected = scan.next(); clear();

            switch (selected.toLowerCase())
            {
                case "addition"       ->       addition();
                case "subtraction"    ->    subtraction();
                case "multiplication" -> multiplication();
                case "division"       ->       division();
                
                case "1"              ->       addition();
                case "2"              ->    subtraction();
                case "3"              -> multiplication();
                case "4"              ->       division();
                
                case "exit"           ->            end();
                case "5"              ->            end();
                default               ->          error();
            }
        } while (stop == false);
    }

    public static void          addition()
    {       
        try 
        {
            System.out.print("Enter a auguend: ");
            auguend = scan.nextInt(); clear();
            
            
            System.out.print("Enter a addend: ");
            addend = scan.nextInt(); clear();

            
            sum = auguend + addend;
            System.out.println("%d + %d = %d".formatted(auguend, addend, sum));
            System.out.println("The sum is %d".formatted(sum)); wait(1500);
        } 
        catch (Exception e) 
        {
            // default
        }
    }

    public static void       subtraction()
    {
        try
        {
            System.out.print("Enter a minuend: ");
            minuend = scan.nextInt(); clear();


            System.out.print("Enter a subtrahend: ");
            subtrahend = scan.nextInt(); clear();


            difference = minuend - subtrahend;
            System.out.println("%d - %d = %d".formatted(minuend, subtrahend, difference));
            System.out.println("The difference is %d".formatted(difference)); wait(1500);
        }
        catch (Exception e)
        {
            // default
        }
    }

    public static void    multiplication()
    {
        try
        {
            System.out.print("Enter a multiplicand: ");
            multiplicand = scan.nextInt(); clear();

            
            System.out.print("Enter a multiplier: ");
            multiplier = scan.nextInt(); clear();

            
            product = multiplicand * multiplier;
            System.out.println("%d * %d = %d".formatted(multiplicand, multiplier, product));
            System.out.println("The product is %d".formatted(product)); wait(1500);
        }
        catch (Exception e)
        {
            // default
        }
    }

    public static void          division()
    {
        try
        {
            System.out.print("Enter a dividend: ");
            dividend = scan.nextInt(); clear();


            System.out.print("Enter a divisor: ");
            divisor = scan.nextInt(); clear();


            quotient = divisor == 0 ? "Undefined" : String.valueOf(dividend / divisor);
            System.out.println("%d / %d = %s".formatted(dividend, divisor, quotient));
            System.out.println("The quotient is %s".formatted(quotient)); wait(1500);
        }
        catch (Exception e)
        {
            // default
        }
    }

    public static void               end()
    {
        clear();
        System.out.println("Thanks.");
        stop = true;
    }

    public static void             error()
    {
        clear();
        System.out.println("Invalid.");
        wait(1500);
    }

    public static void        wait(int ms)
    {

        try {
            Thread.sleep(ms);
        } 
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

    }

    public static void             clear()
    {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}