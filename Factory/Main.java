package Factory;

public class Main {
    public static void main(String[] args) {
        Course lld = CourseFactory.getCourse("LLD");
        Course hld = CourseFactory.getCourse("HLD");
        System.out.println(lld.getModules());
        System.out.println(hld.getModules());
    }
}
