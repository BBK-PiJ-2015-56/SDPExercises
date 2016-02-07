package q3and4abstractfactory;

/**
 * Created by peted on 07/02/2016.
 */
public class LondonErrorParser implements Parser {
    public String parse(String message) {
        System.out.println("London Error has been parsed.");
        return "This is the parsed London error message";
    }
}
