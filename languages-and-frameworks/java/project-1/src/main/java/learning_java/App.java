package learning_java;

import learning_java.basics.Operators;
import learning_java.basics.Variables;
import learning_java.collections.Collections;
import learning_java.functional.Functions;
import learning_java.basics.Flow;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Variables.exec();
        Operators.exec();
        Flow.exec(2);
        Collections.exec();
        Functions.exec();
    }
}
