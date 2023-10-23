package com.xpanxion.assignments.student;
import java.util.*;

public class JavaOne {

    //
    // Constructors
    //

    public JavaOne() {}

    //
    // Public methods
    //

    public void ex1() {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = console.nextLine();
        System.out.print(name.toUpperCase());
        console.close();
    }

    public void ex2() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = console.nextLine();
        int count = 0;
        for (int i = 0; i < sentence.length(); i++)
        {
            if (Character.isUpperCase(sentence.charAt(i)))
            {
                count++;
            }
        }
        System.out.println("Number of uppercase characters: " + count);
        console.close();
    }

    public void ex3() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String sentence = console.nextLine();

        StringTokenizer tokenizer = new StringTokenizer(sentence);

        String result = "";
        int count = 0;
        while (tokenizer.hasMoreTokens())
        {
            if (count % 2 == 0)
            {
                result += tokenizer.nextToken().toUpperCase();
            }
            else
            {
                result += tokenizer.nextToken();
            }
            count++;
            result += " ";
        }
        System.out.println(result);
        console.close();

    }

    public void ex4() {
        
        Scanner console = new Scanner(System.in);
        System.out.print("Enter string: ");
        String pal = console.nextLine();

        String reversed = new StringBuilder(pal).reverse().toString();

        if (pal.equals(reversed))
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        console.close();
    }

    public void ex5() {
        Scanner console = new Scanner(System.in);

        while(true)
        {
            System.out.print("Enter a string: ");
            String to_count = console.nextLine();
            to_count = to_count.toLowerCase();
            int vowels = 0;
            int consonants = 0;

            if (to_count.equals("quit"))
            {
                break;
            }
            for (int i = 0; i < to_count.length(); i++)
            {
                if (Character.isAlphabetic(to_count.charAt(i)))
                {
                    char letter = to_count.charAt(i);
                    if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u')
                    {
                        vowels += 1;
                    }
                    else
                    {
                        consonants += 1;
                    }
                }
                else
                {
                    continue;
                }
            }
            System.out.println("Number of vowels: " + vowels + "\nNumber of consonants: " + consonants);
        }
        console.close();
    }

    public void ex6() {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = console.nextInt();
        System.out.print("Enter second number: ");
        int second = console.nextInt();
        System.out.println("Result: " + (first + second));
        console.close();
    }

    public void ex7() {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int first = console.nextInt();
        System.out.print("Enter second number: ");
        int second = console.nextInt();
        double result = 0;

        boolean validOperation = false;

        while (!validOperation)
        {
            System.out.print("Enter operation (add, sub, mul, div): ");
            String operation = console.next();
            if (operation.equals("add"))
            {
                result = first + second;
                validOperation = true;
            }
            else if (operation.equals("sub"))
            {
                result = first - second;
                validOperation = true;
            }
            else if (operation.equals("mul"))
            {
                result = first * second;
                validOperation = true;
            }
            else if (operation.equals("div"))
            {
                result = first / second;
                validOperation = true;
            }
            else
            {
                System.out.println("Enter a valid operation.");
            }
        }
        System.out.println("Result: " + result);
        console.close();
    }

    public void ex8() {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter price per square feet: ");
        double ppsf = Double.parseDouble(console.nextLine());
        double total_price = 0;

        while (true)
        {
            System.out.print("Enter room dimensions (width x length): ");
            String room_size = console.nextLine();
            if (room_size.equals("done"))
            {
                break;
            }
            else
            {
                StringTokenizer tokenizer = new StringTokenizer(room_size);
                double width = Double.parseDouble(tokenizer.nextToken());
                tokenizer.nextToken();
                double length = Double.parseDouble(tokenizer.nextToken());
                total_price += length*width*ppsf;
            }
        }
        console.close();
        System.out.println("Total cose: $" + total_price);
    }

    public void ex9() {
        Scanner console = new Scanner(System.in);
        int secret_number = (int) Math.random()*5+1;

        while(true)
        {
            System.out.print("Enter a number: ");
            int guess = console.nextInt();
            if (guess == secret_number)
            {
                break;
            }
            else
            {
                System.out.println("Try again...");
            }
        }
        System.out.println("You guessed it!!!");
        console.close();
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
