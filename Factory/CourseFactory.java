package Factory;

public class CourseFactory {
    public static Course getCourse(String courseName) {
        return switch (courseName) {
            case "LLD" -> new LLD();
            case "HLD" -> new HLD();
            default -> null;
        };
    }
}
