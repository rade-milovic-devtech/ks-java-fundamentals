package annotations;

import java.lang.reflect.Method;

//@SuppressWarnings("deprecation")
public class Main {

    public static void main(String... args) {
        Person person = new Person("Nenad", 27L);

        Method[] methods = person.getClass().getMethods();
        for (Method method : methods) {
            if (method.isAnnotationPresent(CustomSuppressWarning.class)) {
                System.out.println(method.getReturnType());
                CustomSuppressWarning customSuppressWarning = method.getAnnotation(CustomSuppressWarning.class);
                System.out.println(customSuppressWarning.value());
            }
        }

        Package pack = person.getClass().getPackage();
        if (pack.isAnnotationPresent(CustomSuppressWarning.class)) {
            CustomSuppressWarning customSuppressWarning = pack.getAnnotation(CustomSuppressWarning.class);
            System.out.println(customSuppressWarning.value());
        }
    }
}
