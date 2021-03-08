package FunctionalInterfaces;

import jdk.jshell.VarSnippet;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class JavaStreamMatches {
    public static void main (String[] args) {
        List<String> animals= Arrays.asList ("Dog","Monkey","2","bonobo");
        Stream<String> infinite= Stream.generate (()->"Chimp").limit (1);
        Predicate<? super String> pred=x->Character.isLetter (x.charAt(0));
        System.out.println (animals.stream ().anyMatch (pred));
        Optional<?> opt=animals.stream().findFirst ();

        System.out.println (animals.stream ().findAny ().get ());
        System.out.println (animals.stream ().findFirst ().get ());
        System.out.println (animals.stream ().allMatch (pred));
        System.out.println (animals.stream ().noneMatch (pred));
        System.out.println (opt.stream().findFirst ().get ());
//        System.out.println (infinite.noneMatch (pred));
        infinite.forEach (System.out::println);
//        System.out.println (infinite.allMatch (pred));
    }
}
