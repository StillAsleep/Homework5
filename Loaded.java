/*
* Loaded State for Rocket
 */

public class Loaded implements NasaRocketState {

    NasaRocket rocket;

    public Loaded(NasaRocket rocket) {
        this.rocket = rocket;
    }

    @Override
    public void empty() {
        System.out.println("\nRocket is full.\n");

    }

    @Override
    public void ready() {
        System.out.println("The Rocket is already ready.");
    }

    @Override
    public void ignition() {
        rocket.setRocketState(rocket.getIgninRocketState());// Load thrusters onto rocket
        System.out.println("The rocket is getting ready to be ignited.");
    }

    @Override
    public void liftOff() {
        System.out.println("Cant Lift when rocket is not ignited.");
    }

    public String toString() {
        return "Loaded";
    }
}
