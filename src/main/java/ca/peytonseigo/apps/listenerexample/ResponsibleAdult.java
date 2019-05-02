package ca.peytonseigo.apps.listenerexample;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * @author Peyton Seigo
 */
public class ResponsibleAdult implements PropertyChangeListener {
    @Override
    public void propertyChange(PropertyChangeEvent event) {
        switch (event.getPropertyName()) {
            case "madeTrouble":
                System.out.println("BOY WHY YOU GOTTA BE CAUSING TROUBLE");
                break;
            case "age":
                System.out.println("BOY WHY YOU GOTT BE TURNING " + event.getNewValue());
                break;
        }
    }
}
