package learning_java.basics;

public class Flow {
    public static void exec(int number){
        for(int i = 0; i < 10; i++){
            System.out.println(i);
        }

        boolean isEven = ((number % 2) == 0);

        switch (number) {
            case 2:
                System.out.println("Two");
                break;
            default:
                System.out.println("Not two");
                break;
        }
    }    
}
