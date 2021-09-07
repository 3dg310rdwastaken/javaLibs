/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaLibs;

import java.util.Scanner;

/**
 *
 * @author jdobbelaere
 */
public class JavaLibs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName;
        String libsFirstName;
        String libsLastName;
        int libsNumberOne;
        int libsNumberTwo;
        String libsCity;
        String libsProperNoun;
        int libsNumberFour;
        String libsVerbOne;
        String libsVerbTwo;
        int libsNumberFive;
        String libsUnitOfTimeOne;
        String libsDrink;
        String libsUnitOfTimeTwo;
        String libsLivingThing;
        String libsAdjective;
        String libsVerbEndingInIngOne;
        String libsVerbEndingInIngTwo;
        String libsNoun;
        String libsVerbThree;
        
        
        
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Please enter your first name: ");
        firstName = sc.nextLine();
        System.out.println("Thank you, " + firstName + " welcome to JavaLibs.");
        System.out.println("First Name:");
        libsFirstName = sc.nextLine();        
        System.out.println("Last Name:");
        libsLastName = sc.nextLine();
        System.out.println("Number:");
        libsNumberOne = sc.nextInt();
        System.out.println("Number:");
        libsNumberTwo = sc.nextInt();
        System.out.println("City Name:");
        libsCity = sc.nextLine();
        System.out.println("Proper Noun:");
        libsProperNoun = sc.nextLine();
        System.out.println("A number from 1 to 12:");
        libsNumberFour = sc.nextInt();
        System.out.println("Verb:");
        libsVerbOne = sc.nextLine();
        System.out.println("Verb");
        libsVerbTwo = sc.nextLine();
        System.out.println("A number from 1 to 12:");
        libsNumberFive = sc.nextInt();
        System.out.println("Unit of time:");
        libsUnitOfTimeOne = sc.nextLine();
        System.out.println("Drink:");
        libsDrink = sc.nextLine();
        System.out.println("Unit of time:");
        libsUnitOfTimeTwo = sc.nextLine();
        System.out.println("Living Thing:");
        libsLivingThing = sc.nextLine();
        System.out.println("Adjective:");
        libsAdjective = sc.nextLine();
        System.out.println("Verb ending in -ing");
        libsVerbEndingInIngOne = sc.nextLine();
        System.out.println("Verb ending with -ing");
        libsVerbEndingInIngTwo = sc.nextLine();
        System.out.println("Noun:");
        libsNoun = sc.nextLine();
        System.out.println("Verb:");
        libsVerbThree = sc.nextLine();
                
                
        
        int libsNumberThree = libsNumberOne + libsNumberTwo;
        System.out.println("My name is " + libsFirstName + " " + libsLastName + ". I'm " + libsNumberThree + " years old. ");
        System.out.println("My house is in the northeast section of " + libsCity + ", where all the villas are, and I am not married. ");
        System.out.println("I work as an employee for the " + libsProperNoun + " department stores, and I get home every day by " + libsNumberFour + " PM at the latest. ");
        System.out.println("I don't " + libsVerbOne + ", but I occasionally " + libsVerbTwo + ".");
        System.out.println("I'm in bed by " + libsNumberFive + " PM, and make sure I get eight " + libsUnitOfTimeOne + " of sleep, no matter what. ");
        System.out.println("After having a glass of " + libsDrink + " and doing about twenty " + libsUnitOfTimeTwo + " of stretches before going to bed, ");
        System.out.println("I usually have no problems sleeping until morning. Just like a " + libsLivingThing + ", ");
        System.out.println("I wake up without any fatigue or stress in the morning. ");
        System.out.println("I was told there were no issues at my last check-up. ");
        System.out.println("I'm trying to explain that I'm a person who wishes to live a very " + libsAdjective + " life. ");
        System.out.println("I take care not to trouble myself with any enemies, like " + libsVerbEndingInIngOne + " and " + libsVerbEndingInIngTwo + ", ");
        System.out.println("that would cause me to lose sleep at night. ");
        System.out.println("That is how I deal with " + libsNoun + ", and I know that is what brings me happiness. ");
        System.out.println("Although, if I were to " + libsVerbThree + " I wouldn't lose to anyone.");
        
    }
    
}
