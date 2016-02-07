package q3and4abstractfactory;

/**
 * Created by peted on 07/02/2016.
 */
public class ParserFactoryProducer {
    public static AbstractParserFactory getFactory(String factoryType){
        if(factoryType == "NYCFactory"){
            return new NYCFactory();
        }else {
            return new LondonFactory();
        }
    }
}
