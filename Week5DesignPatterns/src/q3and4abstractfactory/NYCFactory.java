package q3and4abstractfactory;

/**
 * Created by peted on 07/02/2016.
 */
//Q) would I throw an exception if error type wrongly specified?

/**
 * Created by pdomok01 on 02/02/2016.
 */
public class NYCFactory implements AbstractParserFactory {
    public Parser getParserInstance(String parserType ){
        if(parserType == "NYCERROR"){
            return new NYCErrorParser();
        }else {
            return new NYCOrderParser();
        }
    }
}