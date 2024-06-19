package learning_java.collections;

import java.util.List;

public class Streams {

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
