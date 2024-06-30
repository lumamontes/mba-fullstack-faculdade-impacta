package learning_java.collections;

import java.util.List;

public class Streams {

    //Streams are a new feature in Java 8 that allows you to work with collections in a more functional way.
    // You can use streams to filter, map, reduce, and otherwise manipulate collections of elements.
    //Streams are not data structures that store elements. They are a way to work with collections of elements.

    public static Integer pow(Integer v){
        return v * v;
    }

    public static void exec(){
        System.out.println("Learning streams...");

        var values = List.of(1, 2, 3, 4, 5);
        for(Integer v : values){
            System.out.println(v * v);
        }

        values.stream()
            .map(Streams::pow)
            .forEach(System.out::println);

    }
    
}
