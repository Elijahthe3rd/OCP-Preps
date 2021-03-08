package Generics;

import java.util.*;

public class Comp implements  Comparable<Comp>{

    private String type;
    private String breed;
    private int age;

    public Comp ( String type, String breed,int age) {
        this.type = type;
        this.breed = breed;
        this.age = age;
    }

    public int getAge () {
        return age;
    }

    public String getType () {
        return type;
    }

    public String getBreed () {
        return breed;
    }

    public String toString(){
        return getType ();
    }

    @Override
    public int compareTo (Comp comp) {
        return comp.getAge()-this.age;
    }
}

