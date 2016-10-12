package polymorphism.inheritance.sample2;

public class Main {

    public static void main( String[] args ) {

        class Liquid {
            // ** 1 **
            public String display() {
                return "Displaying LIQUID";
            }

            // ** 4 **
            public String displayAt() {
                return display();
            }
        }

        class Water extends Liquid {
            // ** 2 **
            public String display() {
                return "Displaying WATER";
            }
        }

        class DistilledWater extends Water {
            // ** 3 **
            public String display() {
                return "Displaying DISTILLED WATER";
            }

        }

        Liquid liquid;
        DistilledWater distilledWater = new DistilledWater();

        liquid = distilledWater;

        System.out.println(liquid.displayAt());
        System.out.println(distilledWater.displayAt());

        Water water = new Water();

        liquid = water;
        System.out.println(liquid.displayAt());
    }
}
