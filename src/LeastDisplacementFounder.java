import java.util.Scanner;

public class LeastDisplacementFounder {
    private final String m = "m";
    private final String c = "c";
    private final String p = "p";

    private String string = "";
    private int num = 0;

    Scanner scanner_input;

    //constructor --- you can just use one of setStringAndNum() or constructor
    public LeastDisplacementFounder(String string, int num) {
        this.string = string;
        this.num = num;
        init();
    }

    //initialization
    private void init() {
        scanner_input = new Scanner(System.in);
    }

    // get string and numberOfCards from user via keyboard
    private void setStringAndNum() {

        //getting numberOfCards from user
        System.out.println("please enter the number of person around table...");
        num = scanner_input.nextInt();

        //getting sequenceOfCards from user
        System.out.println("please enter sequence of card as String...");
        string = scanner_input.nextLine();

        if (isValidStatement(string, num)) {
            countDisplacement(string);
        } else {
            System.err.println("invalid entry please try again.");
            setStringAndNum();
        }
    }

    //TODO : check if string is made of 'm' , 'c' , 'p' -- string.length must be equal to n.
    private boolean isValidStatement(String str, int n) {
        return false;
    }

    //TODO : return -1 if it cant be made -- return 0 if mcpc is already exist -- else return num of displacement.
    private int countDisplacement(String str) {
        return 0;
    }
}
