package q3and4abstractfactory;

/**
 * Created by pdomok01 on 02/02/2016.
 */
public class NYCErrorParser implements Parser {

    public String parse(String message) {
        System.out.println("NYC error has been parsed");
        return "This is the parsed NYC error message";
    }
}
