package enumerations;

import static enumerations.Planet.EARTH;

public class EnumerationsExamples {
    public static void main(String[] args) {
        System.out.println("Simple Enums");
        System.out.println("=============\n");

        tellMeYourMoodFor(Day.MONDAY);
        tellMeYourMoodFor(Day.TUESDAY);
        tellMeYourMoodFor(Day.FRIDAY);
        tellMeYourMoodFor(Day.SATURDAY);

        System.out.println("\nComplex Enums");
        System.out.println("=============\n");

        System.out.println("All planets:");
        for (Planet p : Planet.values()) {
            System.out.printf("%s has mass of %f kg and radius of %f m%n", p, p.mass(), p.radius());
        }
        System.out.println();

        double earthWeight = 175;
        double mass = earthWeight / EARTH.surfaceGravity();

        System.out.println("Weight of 175 kg on all planets:");
        for (Planet p : Planet.values()) {
            System.out.printf("Weight on %s is %f kg%n", p, p.surfaceWeight(mass));
        }
    }

    private static void tellMeYourMoodFor(Day day) {
        switch (day) {
            case MONDAY:
                System.out.println("I hate Mondays!");
                break;
            case FRIDAY:
                System.out.println("Yay, it's Friday!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("I love weekends!");
                break;
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
}