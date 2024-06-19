package learning_java.basics;

public class Variables {
    public static void exec(){
        String name = "Luma";
        int age = 21;
        double height = 1.65;
        Double weight = 88.0;
        boolean isStudent = true;

        System.out.printf("%s [%d] : %.2f : %.2f : %b\n", name, age, height, weight, isStudent);
    }
}