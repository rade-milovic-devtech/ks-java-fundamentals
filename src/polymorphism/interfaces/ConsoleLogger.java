package polymorphism.interfaces;

public class ConsoleLogger implements ILogger {

    @Override
    public void handleEvent(String event) {
        System.out.println(event);
    }
}