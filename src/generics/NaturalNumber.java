package generics;

public class NaturalNumber<T extends Integer> {
    private final T number;

    public NaturalNumber(T number) {
        this.number = number;
    }

    public boolean isEven() {
        return number.intValue() % 2 == 0;
    }
}