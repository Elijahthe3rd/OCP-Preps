package Generics;

import java.util.*;

public class Collections {
    ArrayList<Integer> lst;

    public Collections(){
        lst=new ArrayList<>(); // diamond operator + unbounded wildcard

    }

    void lists(){
        lst.add(1);
        lst.add(2);
        lst.add(3);
        lst.add(4);
        lst.add(5);

        for(int val:lst){
            System.out.println(val);
        }
    }

    void printQueues(){
        Queue<String> q=new ArrayDeque<>();
    }

    void printMaps(){
        Map<Integer,String> kv=new HashMap<>();
        kv.put(1,"mapValue1");
        kv.put(2,"mapVal2");
        kv.put(3,"mapVal2");
        kv.put(4,"mapVal2");
        kv.put(5,"mapVal2");

        while(kv.size()>0){
            System.out.println(kv.values());
        }
    }

    void printSets(){
        Set<String> set=new HashSet<>();
        set.add("66");
        set.add("2");
        set.add("66");
        set.add("8");
        set.add("2");

        for (String str:set) {
            System.out.println(str);
        }
    }

}
