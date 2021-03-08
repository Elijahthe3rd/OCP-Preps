package Generics;

public class Vehicle<T> {

    public T start(T t){
        System.out.println(t+" started");
        return t;
    };

    public T move(T t){
        System.out.println("Moving");
        return t;
    };


    public T stop(T t){
        System.out.println("Stopped");
        return  t;
    };
}
