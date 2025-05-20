package logic.ioflow;
/**
 * This class handles the inputs made by the user during de program.
 */
public class InputHandler {
    public InputHandler() {
    }

    protected boolean isValid(String input) {
        return input.length() < 13 && !input.isEmpty();
    }

    protected String toCapitalFormat(String input) {
        String first = input.substring(0,1).toUpperCase();
        String second = input.substring(1).toLowerCase();
        return first.concat(second);
    }
}
