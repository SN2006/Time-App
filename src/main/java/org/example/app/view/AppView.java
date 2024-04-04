package org.example.app.view;

import java.util.Scanner;

public class AppView {

    private static final Scanner SCANNER = new Scanner(System.in);

    public void getMenu(){
        System.out.println("""
                ---------------------------------Menu----------------------------------
                1 - Converting seconds to hours, minutes and seconds in hh:mm:ss format
                0 - Close app
                Select an option:
                """);
    }

    public String getData(){
        return SCANNER.nextLine();
    }

    public void getOutput(String output){
        System.out.println(output);
    }

}
