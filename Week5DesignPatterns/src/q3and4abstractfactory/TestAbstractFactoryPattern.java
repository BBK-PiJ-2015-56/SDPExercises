//Q) why is getFactory a static method? Why dont we instantiate the FactoryProducer
//   and then call getFactory on the instance?

package q3and4abstractfactory;

/**
 * Created by pdomok01 on 02/02/2016.
 */
public class TestAbstractFactoryPattern {
    public static void main(String[] args) {
        AbstractParserFactory parserFactory = ParserFactoryProducer.getFactory("NYCFactory");
        Parser parser = parserFactory.getParserInstance("NYCORDER");
        String msg = "";
        msg = parser.parse(msg);
        System.out.println(msg);
        System.out.println("************************************");
        parserFactory = ParserFactoryProducer.getFactory("LondonFactory");
        parser = parserFactory.getParserInstance("LondonERROR");
        msg = parser.parse(msg);
        System.out.println(msg);
    }
}
