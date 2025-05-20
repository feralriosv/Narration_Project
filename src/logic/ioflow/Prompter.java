package logic.ioflow;

import java.util.Scanner;
/**
 * This class handles all interactive communication with the user.
 * It is responsible for displaying prompts and retrieving user input during the story setup
 * and decision-making process.
 */
public class Prompter {
    private final InputHandler inputHandler;
    private final Scanner scanner;

    public Prompter() {
        inputHandler = new InputHandler();
        scanner = new Scanner(System.in);
    }

    private String getPrompt(String message) {
        System.out.println(message);
        return scanner.nextLine();
    }

    protected String promptCharacterName() {
        String input = getPrompt("PROMPT MESSAGE");
        while (!inputHandler.isValid(input)) {
            System.out.println("TRY AGAIN MESSAGE");
            input = scanner.nextLine();
        }
        System.out.println("Established " + input + " as character name.");
        return inputHandler.toCapitalFormat(input);
    }
}
