package polymorphism.interfaces;

public class Main {

    public static void main(String [] args){

        Log logger = new Log();
        FileLogger fileLogger = new FileLogger();
        ConsoleLogger consoleLogger = new ConsoleLogger();

        logger.registerLogger( fileLogger );
        logger.registerLogger( consoleLogger );

        logger.log("Hello World!!");
        logger.log("Second log event!");
    }
}
