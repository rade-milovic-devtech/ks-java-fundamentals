package composition.sample1;


public class Main {

    public static void main(String[] args){
        Person person = new Person();

        long salary = person.getSalary();

        System.out.println(salary);
    }
}
