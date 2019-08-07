package recruitmenttask.task1.service;

import java.util.Scanner;

public class InputText {



public static String textFromconsole(String prompt) {

    Scanner scan = new Scanner(System.in);
    System.out.println(prompt);
    String name = scan.nextLine();

    while(name.trim().length()==0 ){

        System.out.println("no text detected, enter again");
        name = scan.nextLine();
    }

    return name.trim().replaceAll("[^a-zA-Z\\s ]", "");
    }
}