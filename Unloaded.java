/*
* Unloaded State of Rocket
 */

public class Unloaded implements NasaRocketState {

    NasaRocket rocket;

    public Unloaded(NasaRocket rocket) {
        this.rocket = rocket;
    }

    @Override
    public void empty() {
        System.out.println("\nRocket is empty.\n");

    }

    @Override
    public void ready() {
        rocket.setRocketState(rocket.getLoadedState());
        System.out.println("The Rocket is being prepared.");
    }

    @Override
    public void ignition() {
        System.out.println("There is nothing to ignite.");
    }

    @Override
    public void liftOff() {
        System.out.println("Cant Lift when rocket is not ignited.");
    }

    public String toString() {
        return "Empty";
    }
}
