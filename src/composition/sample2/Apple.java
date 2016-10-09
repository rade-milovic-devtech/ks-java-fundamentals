package composition.sample2;

public class Apple {

    private Fruit fruit = new Fruit();

    public int peel() {
        return fruit.peel();
    }
}
