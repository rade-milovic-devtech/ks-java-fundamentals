package generics;

public class Box<T> {
    private T value;

    public static Box<Integer> toIntBox(Box<? extends Number> box) {
        Box<Integer> integerBox = new Box<>();
        integerBox.set(box.get().intValue());

        return integerBox;
    }

    public static Box<String> toStringBox(Box<?> box) {
        Box<String> stringBox = new Box<>();
        stringBox.set(box.get().toString());

        return stringBox;
    }

    public T get() {
        return value;
    }

    public void set(T value) {
        this.value = value;
    }

    public <U extends Number> void inspect(U value) {
        System.out.println("T: " + this.value.getClass().getName());
        System.out.println("U: " + value.getClass().getName());
    }
}