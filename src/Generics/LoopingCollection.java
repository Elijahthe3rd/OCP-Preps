package Generics;

import java.util.Arrays;
import java.util.List;

public class LoopingCollection {

    List<String> cats ;

    LoopingCollection(String[] catens){
        cats= Arrays.asList(catens);
    }

    public void printCatWithForLoop(){
        System.out.println("\nUsing: "+new Exception().getStackTrace()[0].getMethodName()+"\n");

        for(String cat: cats)
            System.out.println(cat);
    }

    public void printCatWithLambda(){
        System.out.println("\nUsing: "+new Exception().getStackTrace()[0].getMethodName()+"\n");

        cats.forEach(c-> System.out.println(c));
    }

    public void printCatWithMethodRef(){
        System.out.println("\nUsing: "+new Exception().getStackTrace()[0].getMethodName()+"\n");

        cats.forEach(System.out::println);
    }

    public static void main(String[] args) {

        LoopingCollection loopingCollection=new LoopingCollection(new String[]{"puss","cat","pudding","floppy"});

        loopingCollection.printCatWithForLoop();

        System.out.println("---------------------------------------------------------------------------------");

        loopingCollection.printCatWithLambda();

        System.out.println("---------------------------------------------------------------------------------");

        loopingCollection.printCatWithMethodRef();

        System.out.println("---------------------------------------------------------------------------------\n---------------------------------------------------------------------------------");
        LoopingCollection loopingCollection2=new LoopingCollection(new String[]{"Elanor","jacks","freddy"});

        loopingCollection2.printCatWithLambda();
        loopingCollection2.printCatWithMethodRef();
        loopingCollection2.printCatWithForLoop();

    }
}
