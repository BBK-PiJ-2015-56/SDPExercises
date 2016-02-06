package q3and4abstractfactory;



/**
 * Created by pdomok01 on 02/02/2016.
 */
public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYCFactory");
        NYCParser parser = parserFactory.getParserInstance("NYCORDER");
        String msg = "";
        msg = parser.parse();
        System.out.println(msg);
        System.out.println("************************************");
        parserFactory = ParserFactoryProducer.getFactory("LondonFactory");
        parser = parserFactory.getParserInstance("LondonFEEDBACK");
        msg = parser.parse();
        System.out.println(msg);
    }
}
