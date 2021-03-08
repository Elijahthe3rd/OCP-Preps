package FunctionalInterfaces;

import java.util.Locale;
import java.util.stream.Stream;

public class JavaStreamFilter {
    public static void main (String[] args) {
        Stream<String> s=Stream.of ("Money","Gwap","Ching","Randels","moola");
        long count=s.filter (x->x.toString().startsWith ("m")).peek (x-> System.out.println (x)).count ();
//        System.out.println (count);
    }
}
