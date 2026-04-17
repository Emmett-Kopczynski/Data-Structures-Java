package testUtils;

/**
 * A class for storing static variables and methods for displaying the results of test cases 
 */
public class Results{
    
    private Results(){
    }

    /**
     * A Unicode Checkmark
     */
    static public char check = '\u2713';

    /**
     * this method returns Strings that show the result of a boolean test in the form <br>
     * "-- (name) - (PASSED/FAILED) - [(check/x)]" - with check being replaced with the unicode checkmark, and with the slashes being (if value true)/(if value false)
     * @param value - the boolean result of the test
     * @param name - the name of the test as a String
     * @return - returns a String that signifies whether the test passed or not
     */
    public static String test(boolean value, String name){
        if (value){
            return "-- " + name + " - PASSED - [" + check + "]";
        } return  "-- " + name + " - FAILED - [x]";
    }

}
