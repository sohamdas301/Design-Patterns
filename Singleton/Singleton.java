package Singleton;

public class Singleton {
    private static volatile Singleton singleton = null;
    private Singleton() {
        System.out.println("Constructor Invoked");
    }
    public static Singleton getSingletonClass() {
        if(singleton == null) {
            synchronized (Singleton.class) {
                if(singleton == null) singleton = new Singleton();
            }
        }
        return singleton;
    }
}
