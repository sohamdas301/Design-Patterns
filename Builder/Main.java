package Builder;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog.DogBuilder().setBreed("PUG").setPrice(2000).build();
        System.out.println(dog);
    }
}
