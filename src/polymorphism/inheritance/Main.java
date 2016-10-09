package polymorphism.inheritance;

public class Main {

    public static void main (String args []) {

        Liquid liquid1,liquid2,liquid3;

        liquid1 = new Liquid();
        liquid2 = new Milk();
        liquid3 = new Coffee();

        liquid1.method();
        liquid2.method();
        liquid3.method();
    }
}
