package FunctionalInterfaces;

import java.awt.*;
import java.util.*;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class JavaStreamReduce {
    public static void main (String[] args) {
        Stream<String> stm=Stream.of ("A","O","n","e","","W");
        String name=stm.reduce ("",(s,c)-> s+=c);
//        String word=stm.reduce ("",String::concat);
        System.out.println (name);
//        System.out.println (word);

        Stream<Integer> vals=Stream.of (3,5,6);
        int in= vals.reduce (1,(a1,a2)->a1*a2);
//        System.out.println (in);

        BinaryOperator<Integer> op=(a,b)->a*b;
        Stream<Integer> sm=Stream.of (3,5,6);
        Integer n=sm.reduce (1,op,op);

        Stream<String> stream=Stream.of ("E","L","I","J","A","H");
        StringBuilder sb = stream.collect (StringBuilder::new,StringBuilder::append,StringBuilder::append);
        System.out.println (sb);

        Stream<String> stream2=Stream.of ("E","L","I","J","A","H");
        List<String> sb2 = stream2.collect (ArrayList::new,ArrayList::add ,ArrayList::addAll);
        System.out.println (sb2);
        System.out.println (sb2.stream ().reduce ((x,y)->x+=y).get ());
    }
}
