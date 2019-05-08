package ca.peytonseigo.apps.model;

import ca.peytonseigo.apps.exception.NotActivePlayerException;
import com.google.common.collect.BiMap;
import com.google.common.collect.ImmutableBiMap;

import java.beans.PropertyChangeSupport;

/**
 * A Connect Four game that manages players, moderates game rules and tracks the state.
 *
 * @author Peyton Seigo
 * @author Madeline Ferguson
 */
public class Game {
  private Player activePlayer;
  private BiMap<Player, GamePiece> playerGamePieces;
  private PropertyChangeSupport pcs;

  /**
   * Creates a new game between two given players. Adds each player as a listener for the
   * {@code activePlayer} field.
   * @param player1 one of the players
   * @param player2 one of the players
   */
  public Game(Player player1, Player player2) {
    pcs = new PropertyChangeSupport(this);
    pcs.addPropertyChangeListener("activePlayer", player1);
    pcs.addPropertyChangeListener("activePlayer", player2);

    playerGamePieces = new ImmutableBiMap.Builder<Player, GamePiece>()
        .put(player1, GamePiece.PLAYER1)
        .put(player2, GamePiece.PLAYER2)
        .build();
  }

  /**
   * Returns true if it is currently the {@code player}'s turn, otherwise returns false.
   *
   * @return true if {@code player} is the active player
   */
  public boolean isActive(Player player) {
    return activePlayer.equals(player);
  }

  // TODO: be wary of security (i.e., player1 might make commands on player2's behalf)
  /**
   * Returns a reference to current player whose turn it is.
   *
   * @return player whose turn it is
   */
  public Player activePlayer() {
    return activePlayer;
  }

  // TODO: might not need this, but we can keep it around until we get to testing
  /**
   * Adds a player to the game.
   *
   * @param p the player to be added
   */
  public void addPlayer(Player p) {

  }

  // TODO: throw `PlayerMoveException`s: NotActivePlayer, IllegalMove, InvalidBoardIndex, etc.
  /**
   * Places a game piece for {@code player} at the given board {@code column} (0-based from the
   * left). The player must pass a reference of itself for authorization purposes; the game needs to
   * know who is making the move.
   *
   * @param player the player responsible for the move
   * @param column column to drop the piece into
   * @throws NotActivePlayerException if it is not the {@code player}'s turn
   */
  public void makeMove(Player player, int column) throws NotActivePlayerException {
    if (!isActive(player)) {
      throw new NotActivePlayerException();
    }
  }

  /**
   * Advances the turn to the next player. Fires a {@code propertyChangeEvent} to notify any
   * listeners (i.e., the players) of the turn change. In particular, if the current active player
   * is player 1, @{code advanceTurn} changes it to player 2, and vice versa.
   */
  private void advanceTurn() {
    // ... setActivePlayer(...)
    // notify listeners
  }


  /**
   * Sets the current active player (the player whose turn it is).
   *
   * @param p the new active player
   */
  private void setActivePlayer(Player p) {
    this.activePlayer = p;
  }
}
