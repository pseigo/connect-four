package ca.peytonseigo.apps.listenerexample;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Peyton Seigo
 */
public class Child {
    private String name;
    private PropertyChangeSupport pcs;
    private List<ResponsibleAdult> responsibleAdults;
    private boolean madeTrouble;
    private int age;

    public Child(String name, int age) {
        this.name = name;
        this.age = age;

        pcs = new PropertyChangeSupport(this);
        responsibleAdults = new ArrayList<>();
        madeTrouble = false;
    }

    public void addResponsibleAdult(ResponsibleAdult rd) {
        responsibleAdults.add(rd);
        pcs.addPropertyChangeListener("madeTrouble", rd);
        pcs.addPropertyChangeListener("age", rd);
    }

    public void makeTrouble() {
        pcs.firePropertyChange("madeTrouble", madeTrouble, true);
        madeTrouble = true;
    }

    public void setAge(int age) {
        pcs.firePropertyChange("age", this.age, age);
        this.age = age;
    }
}
