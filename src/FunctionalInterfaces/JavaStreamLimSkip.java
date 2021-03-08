package FunctionalInterfaces;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamLimSkip {
    public static void main (String[] args) {
        Stream<Integer> s=Stream.iterate (0,n->n+1).limit (6);
//        s.skip (2).forEach (System.out::println);

        Stream<String> s2=Stream.of ("money","Cash","moola");
         s2.map (x->x.length ()).forEach (System.out::println);



         List<String> z= Arrays.asList ();
         List<String> o=Arrays.asList ("bonobo");
         List<String> t=Arrays.asList ("baby bear","Mama bear");

         Stream<List<String>> b=Stream.of (z,o,t);
//         b.forEach (x-> System.out.println ( x));
        b.flatMap (l->l.stream ().sorted ()).forEach (System.out::println);
//        b.flatMap (l->l.stream ().sorted (Comparator.reverseOrder ())).forEach (System.out::println);
    }

}
