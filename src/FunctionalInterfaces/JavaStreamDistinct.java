package FunctionalInterfaces;

import java.util.*;
import java.util.stream.Stream;

public class JavaStreamDistinct {
    public static void main (String[] args) {
        Set<Integer> stream=new HashSet<> (List.of (1,2,3,1,2,3,4,5,44,5,6,7,7,8,9,10,106,44,3,43,34,23,23,43));
        Stream<Integer> numbers=stream.stream ();
        numbers.distinct ().forEach (System.out::println);



    }
}
