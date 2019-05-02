package ca.peytonseigo.apps.model;

/**
 * A Connect Four game that manages players, moderates game rules and tracks the state.
 * @author Peyton Seigo
 */
public class Game {
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
