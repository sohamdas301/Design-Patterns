package Singleton;

public class Main {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getSingletonClass();
        Singleton s2 = Singleton.getSingletonClass();
        System.out.println(s1);
        System.out.println(s2);
    }
}
