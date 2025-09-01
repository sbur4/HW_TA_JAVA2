package com.epam.console;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AppConsole {

    public static void runApp() {

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) { //todo nio
            String name;
            do {
                name = reader.readLine();
                if (name.equalsIgnoreCase("start")) {
                    //print menu
                    System.out.println("menu");
                }
//                if(name.equalsIgnoreCase("exit")){
//                    System.out.println("buy");
//                }
            } while (!name.equalsIgnoreCase("exit"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

// UI commands: START EXIT
// menu :
// 1 -show
// 2 -add ->
// 3 -remove ->
// 4 -sort ->

