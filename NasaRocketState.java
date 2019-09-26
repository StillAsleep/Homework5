/**
 * State Design Pattern interface
 */
public interface NasaRocketState {

    public void empty();

    public void ready();

    public void ignition();

    public void liftOff();
}