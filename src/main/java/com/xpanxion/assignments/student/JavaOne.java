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
    }

    public void ex6() {
        System.out.println("Student 1: ex6.");
    }

    public void ex7() {
        System.out.println("Student 1: ex7.");
    }

    public void ex8() {
        System.out.println("Student 1: ex8.");
    }

    public void ex9() {
        System.out.println("Student 1: ex9.");
    }

    public void ex10() {
        System.out.println("Student 1: ex10.");
    }

    //
    // Private helper methods
    //
}
