package ca.peytonseigo.apps.model;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Player class.
 * @author Peyton Seigo
 * @author Madeline Ferguson
 */
public class Player implements PropertyChangeListener {

  public Player(){

  }

  /**
   * This method gets called when a bound property is changed.
   *
   * @param event A PropertyChangeEvent object describing the event source and the property that
   *     has changed.
   */
  public void propertyChange(PropertyChangeEvent event) {

  }

  /**
   * Sends a move to the Game.
   * @param column column to drop the piece into
   */
  public void makeMove(int column){

  }

  // TODO: override equals and hashcode; see Game.isActive/1
}
