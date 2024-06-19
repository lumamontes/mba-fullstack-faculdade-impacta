package learning_java.collections;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {
    public static void main(String[] args) {
        exec();
    }
    public static void exec() {
        System.out.println("Collections");
        // Array de Strings
        String[] names = {"John", "Jane", "Jack"};
        // Corrigido para imprimir o conteúdo do array corretamente
        System.out.println(java.util.Arrays.toString(names)); 
        // List usando métodos de fábrica
        var namesList = List.of("John", "Jane", "Jack");
        System.out.println(namesList);

        // Map usando métodos de fábrica
        var rec = Map.of("name", "John", "age", "30");
        System.out.println(rec);
        // Map usando inicialização clássica
        Map<String, String> recordOld = new HashMap<>();
        recordOld.put("name", "John");
        recordOld.put("age", "30");
        System.out.println(recordOld);
    }
}