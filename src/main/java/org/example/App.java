package org.example;

import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello. Press input text");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        System.out.println(String.format("Total wolds %d", new CalcText().countWorld(text)));
        System.out.println(String.format("Total char %d", new CalcChar().calc(text)));
    }

}
