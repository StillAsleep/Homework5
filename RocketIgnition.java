/*
* Rocket Ignition state
 */

public class RocketIgnition implements NasaRocketState {

    NasaRocket rocket;

    public RocketIgnition(NasaRocket rocket) {
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
        System.out.println("The rocket is already ignited.");
    }

    @Override
    public void liftOff() {
        rocket.setRocketState(rocket.getRocketLiftOffState());
        System.out.println("Rocket getting ready for liftoff.");
    }

    public String toString() {
        return "Ignited";
    }
}
