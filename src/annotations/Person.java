
package annotations;

//@Deprecated
public class Person {

    @CustomSuppressWarning
    private String name;
    private Long age;

    @CustomSuppressWarning
    public Person(@CustomSuppressWarning String name,Long age) {
        this.name = name;
        this.age = age;
    }
    @CustomSuppressWarning
    public void method() {@CustomSuppressWarning String text = name + age;
    }
}
