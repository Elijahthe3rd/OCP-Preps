package Generics;

public interface Car {

    default void name(String name){
        System.out.println(name);
    }
    String getCarName();
}
