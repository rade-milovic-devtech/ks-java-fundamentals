package polymorphism.compile;

public class A {

    void method(int num) {
        System.out.println ("method:" + num);
    }

    void method(int num1, int num2) {
        System.out.println ("method:" + num1 + "," + num2);
    }

    void method(double num) {
        System.out.println("method:" + num);
    }
}
