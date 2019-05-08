package ca.peytonseigo.apps.model;

import java.beans.PropertyChangeSupport;
import java.util.List;

/**
 * A Connect Four game that manages players, moderates game rules and tracks the state.
 *
 * @author Peyton Seigo
 */
public class Game {
  private Player turn;
  private List<Player> players;
  private PropertyChangeSupport pcs;

  public Game() {

  }

  /**
   * Gets who's turn it is.
   *
   * @return who's turn it is
   */
  public Player getTurn() {
    return turn;
  }

  /**
   * Sets the turn. Fires property change event to notify players of turn change.
   *
   * @param turn The player who's turn it is being set to.
   * @throws
   */
  public void setTurn(Player turn) {
    this.turn = turn;

  }

  /**
   * Changes the turn.
   * For example, if the current value of turn is PLAYER1, changeTurn changes it to PLAYER2.
   */
  public void changeTurn() {

  }

  /**
   * Adds a player to the game.
   *
   * @param p the player to be added
   */
  public void addPlayer(Player p) {

  }

  /**
   * Computes a thing. Here is some extra info that wouldn't fit into the one sentence
   * description. You can reference names in the code using this syntax: {@code someParam}.
   *
   * @param someParam number of penguins
   * @return short description of what is being returned
   * @throws Exception if someParam is less than 5 (the acceptable threshold for penguins)
   * @see <a href="https://www.tutorialspoint.com/java/java_documentation.htm">Documentation
   * Comments</a> for further explanation and examples for writing Javadocs comments.
   */
  public int exampleMethod(int someParam) throws Exception {
    if (someParam < 5) {
      throw new Exception();
    }

    return 0;
  }
}
