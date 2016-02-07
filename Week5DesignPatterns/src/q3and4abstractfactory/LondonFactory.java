package q3and4abstractfactory;

/**
 * Created by peted on 07/02/2016.
 */
public class LondonFactory implements AbstractParserFactory {
    public Parser getParserInstance(String parserType ){
        if(parserType == "LondonERROR"){
            return new LondonErrorParser();
        }else {
            return new LondonOrderParser();
        }
    }
}

