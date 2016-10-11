package inheritance.sample3;


public class Main {

    public static void main(String[] args) {

        class SuperClass {

            public void method1() {
                System.out.println("superclass method1");
                this.method2();
            }

            public void method2() {
                System.out.println("superclass method2");
            }

        }

        class SubClass extends SuperClass {

            @Override
            public void method1() {
                System.out.println("subclass method1");
                super.method1();
            }

            @Override
            public void method2() {
                System.out.println("subclass method2");
            }
        }

        SubClass mSubClass = new SubClass();
        mSubClass.method1();
    }

}
