package week1.coreJava.question4;

public class Main {
    public static void main(String[] args) {
        SingletonExample object1 = SingletonExample.getInstance();

        object1.printSomething();

        SingletonExample object2 = SingletonExample.getInstance();

        object2.printSomething();

        System.out.println(object1 == object2);//output is true
    }
}
