package learning_java.functional;

import java.util.function.Function;

public class Functions {
    public static String prefix = "prefix";

    public static Function<String, String> loggerBuilder(String prefix){
        return (msg) -> {
            var log = String.format("%s %s", prefix, msg);
            System.out.println(log);
            return log;
        };
    };
    public static void exec(){
       var log = loggerBuilder(prefix);
       log.apply("Hello function programming");
    }
    
}
