package q3and4abstractfactory;

/**
 * Created by pdomok01 on 02/02/2016.
 */
public class NYCErrorParser implements Parser {

    public String parse(String message) {
        System.out.println("error has been parsed");
        return "parsed error message";
    }
}
