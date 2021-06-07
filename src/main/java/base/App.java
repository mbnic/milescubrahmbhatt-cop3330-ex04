/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Nicolas Milescu-Brahmbhatt
 */

package base;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        String noun = myApp.getNoun();
        String verb = myApp.getVerb();
        String adjective = myApp.getAdjective();
        String adverb = myApp.getAdverb();

        myApp.printMadlib(noun, verb, adjective, adverb);
    }


    public void printMadlib(String noun, String verb, String adj, String adv) {
        System.out.printf("Do you %s your %s %s %s?", verb, adj, noun, adv);
    }


    public String getNoun() {
        System.out.println("Enter a noun: ");
        String word = in.nextLine();
        return word;
    }

    public String getVerb() {
        System.out.println("Enter a verb: ");
        String word = in.nextLine();
        return word;
    }

    public String getAdjective() {
        System.out.println("Enter an adjective: ");
        String word = in.nextLine();
        return word;
    }

    public String getAdverb() {
        System.out.println("Enter an adverb: ");
        String word = in.nextLine();
        return word;
    }
}