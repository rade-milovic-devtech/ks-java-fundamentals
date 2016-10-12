package polymorphism.inheritance.sample1;

public class Main {

    public static void main (String args []) {

        class Liquid {

            public void method()
            {
                System.out.println ("hello, I'm method of class Liquid");
            }
        }


        class Coffee extends Liquid {

            @Override
            public void method()
            {
                System.out.println ("hello, I'm method of class Coffee");
            }
        }

        class Milk extends Liquid {

            @Override
            public void method()
            {
                System.out.println ("hello, I'm method of class Milk");
            }
        }

        Liquid liquid1,liquid2,liquid3;

        liquid1 = new Liquid();
        liquid2 = new Milk();
        liquid3 = new Coffee();

        liquid1.method();
        liquid2.method();
        liquid3.method();
    }
}
