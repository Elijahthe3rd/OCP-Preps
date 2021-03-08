package FunctionalInterfaces;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main (String[] args) {
        Stream<String> empt=Stream.empty ();
        Stream<Integer> singleElement=Stream.of (1);
        Stream<String> FromArr=Stream.of ("1","2","3","4");
        ArrayList<Integer> arrayList=new ArrayList<> ( List.of(1,2,3,4,5));
        Stream<Stream<?>> ss=Stream.of (empt,singleElement,FromArr);
        ss.flatMap (l->l.distinct ()).forEach (System.out::println);

//        Stream<Integer> fromArr=arrayList.stream();
//        Stream<Integer> fromParallelArr=List.of(1,2,3,4,5,6).parallelStream ();

//        arrayList.forEach (System.out::println);
//        fromParallelArr.sorted ((x,y)-> x-y);
//
//        fromParallelArr.forEach ((x)-> System.out.println (x.intValue ()));
//        System.out.println (singleElement.toArray ());
//        Stream<Double> rand= Stream.generate (Math::random);
//        Stream<Integer> oddNumbers = Stream.iterate(21, n ->  (n%2==0 ? 0 : n +2)).limit (5);
//        oddNumbers.forEach (System.out::println);
//      Double am=Math.random ();
//      System.out.println (Math.round(am*5));
//        Optional<?> min=oddNumbers.max ((s1,s2)->s1-s2);
//        min.ifPresent (System.out::println);

    }

}
