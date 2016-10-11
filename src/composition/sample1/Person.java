package composition.sample1;

public class Person {

    private Job job = new Job();

    public Person() {
        job.setSalary(1000L);
    }

    public long getSalary() {
        return job.getSalary();
    }
}
