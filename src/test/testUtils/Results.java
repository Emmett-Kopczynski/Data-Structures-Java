package testUtils;



public class Results{

    static public char check = '\u2713';


    public static String test(boolean value, String name){
        if (value){
            return "--" + name + " - PASSED - [" + check + "]";
        } return  "--" + name + " - FAILED - [x]";
    }

}
