package NullPattern;

public class NullObject implements Vehicle{
    @Override
    public int getSeatingCapacity() {
        return 0;
    }

    @Override
    public int getTankCapacity() {
        return 0;
    }
}
