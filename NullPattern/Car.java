package NullPattern;

public class Car implements Vehicle{
    @Override
    public int getSeatingCapacity() {
        return 6;
    }

    @Override
    public int getTankCapacity() {
        return 50;
    }
}
