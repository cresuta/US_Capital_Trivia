package com.company;


import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        new GUI();

        Scanner input = new Scanner(System.in);

        HashMap<String, String> capital = new HashMap<>();
        capital.put("Alabama","Montgomery");
        capital.put("Alaska","Junea");
        capital.put("Arizona","Phoenix");
        capital.put("Arkansas","Little Rock");
        capital.put("California","Sacramento");
        capital.put("Colorado","Denver");
        capital.put("Connecticut","Hartford");
        capital.put("Delaware","Dover");
        capital.put("Florida","Tallahassee");
        capital.put("Georgia","Atlanta");
        capital.put("Hawaii","Honolulu");
        capital.put("Idaho","Boise");
        capital.put("Illinois","Springfield");
        capital.put("Indiana","Indianapolis");
        capital.put("Iowa","Des Moines");
        capital.put("Kansas","Topeka");
        capital.put("Kentucky","Frankfort");
        capital.put("Louisiana","Baton Rouge");
        capital.put("Maine","Augusta");
        capital.put("Maryland","Annapolis");
        capital.put("Massachusetts","Boston");
        capital.put("Michigan","Lansing");
        capital.put("Minnesota","Saint Paul");
        capital.put("Mississippi","Jackson");
        capital.put("Missouri","Jefferson City");
        capital.put("Montana","Helena");
        capital.put("Nebraska","Lincoln");
        capital.put("Nevada","Carson City");
        capital.put("New Hampshire","Concord");
        capital.put("New Jersey","Trenton");
        capital.put("New Mexico","Santa Fe");
        capital.put("New York","Albany");
        capital.put("North Carolina","Raleigh");
        capital.put("North Dakota","Bismarck");
        capital.put("Ohio","Columbus");
        capital.put("Oklahoma","Oklahoma City");
        capital.put("Oregon","Salem");
        capital.put("Pennsylvania","Harrisburg");
        capital.put("Rhode Island","Providence");
        capital.put("South Carolina","Columbia");
        capital.put("South Dakota","Pierre");
        capital.put("Tennessee","Nashville");
        capital.put("Texas","Austin");
        capital.put("Utah","Salt Lake City");
        capital.put("Vermont","Montpelier");
        capital.put("Virgina","Richmond");
        capital.put("Washington","Olympia");
        capital.put("West Virginia","Charleston");
        capital.put("Wisconsin","Madison");
        capital.put("Wyoming","Cheyenne");

        int score = 0;
        int questionTally = 50;

        for(String state : capital.keySet()) {
            System.out.println("What is the capital of " + state + " ?");
            String answer = input.nextLine();
            if(answer.toLowerCase().equals(capital.get(state).toLowerCase())){
                System.out.println("Correct!");
                score += 1;
                questionTally -= 1;
            }
            else{
                System.out.println("Incorrect!");
                questionTally -= 1;
            }
            continue;
        }
        if(questionTally == 0){
            System.out.println("Game Over. You guessed " + score + "/50 correct!");
        }

//      Loop through all States
//      Ask user what the capital is
//      Compare user input to State Value entry (make both lowercase while comparing)
//      If they are the same, add a point to the user's score
//      If they are different, break the loop to end the game
//      If user gets all 50 capitols right (game loop ends), User wins the game.

//      Create a UI for the game above
//      Add a map next to the game that shows the US
//      Add a tally to keep track of how many the user got correct and incorrect
    }

}