package polymorphism.interfaces;

import java.util.ArrayList;

public class Log {

    private ArrayList<ILogger> listeners = new ArrayList<>();

    public void registerLogger (ILogger logger){

        listeners.add(logger);
    }

    public void log (String event){

        for (ILogger logger : listeners){
            logger.handleEvent(event);
        }
    }

}
