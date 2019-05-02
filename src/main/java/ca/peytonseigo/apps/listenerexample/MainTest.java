package ca.peytonseigo.apps.listenerexample;

/**
 * @author Peyton Seigo
 */
public class MainTest {
  public static void main(String[] args) {
    ResponsibleAdult casandra = new ResponsibleAdult();

    Child jimmy = new Child("Jimmy", 11);
    jimmy.addResponsibleAdult(casandra);
    jimmy.makeTrouble();
    jimmy.makeTrouble(); // this won't call propertyChange
    jimmy.setAge(12);
    jimmy.setAge(13);
  }
}
