package Generics;

import Generics.Comp;

import java.util.ArrayDeque;

public class testComparable {
    public static void main (String[] args) {

        ArrayDeque<Comp> animals = new ArrayDeque<> ();
        animals.add (new Comp ("Dog", "Pit-Bull", 1));
        animals.add (new Comp ("Cat", "Wild-Cat", 4));
        animals.add (new Comp ("Fish", "Tuna", 3));
        animals.add (new Comp ("Bird", "Flamingo", 4));

        Comp a1 = new Comp ("Dog", "Pit-Bull", 1);

        System.out.println (animals.element ());

        animals.forEach ((c) -> {
            System.out.println (c.compareTo (a1));
        });

        animals.pollLast ();

    }
}
