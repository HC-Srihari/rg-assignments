package week1.coreJava.question4;

public class SingletonExample {
    private static SingletonExample singletonObject;

    private SingletonExample(){
        System.out.println("Singleton instance created");
    }

    public static SingletonExample getInstance(){
        if(singletonObject == null){
            singletonObject = new SingletonExample();
        }
        return singletonObject;
    }

    public void printSomething(){
        System.out.println("OK, printing something");
    }


}
