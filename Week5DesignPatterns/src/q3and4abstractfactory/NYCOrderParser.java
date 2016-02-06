package q3and4abstractfactory;

/**
 * Created by pdomok01 on 02/02/2016.
 */
public class NYCOrderParser implements Parser {
    public String parse(String message) {
        System.out.println("order has been parsed.");
        return "parsed order message";
    }
}
