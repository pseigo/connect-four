package ca.peytonseigo.apps.exception;

/**
 * A permission error due to a command made when it is not the user's turn. This is thrown when a
 * user attempts to do something that they are not permitted to do, such as making a move when it is
 * not the user's turn.
 * @author Peyton Seigo
 */
public class NotActivePlayerException extends PlayerMoveException {
}
