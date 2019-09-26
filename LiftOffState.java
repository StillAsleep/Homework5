/*
* Lift Off state
*/
public class LiftOffState implements NasaRocketState {

    NasaRocket rocket;

    public LiftOffState(NasaRocket rocket) {
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
        System.out.println("Lift Off!");
        rocket.setRocketState(rocket.getUnloadedState()); // Gets rid of baggage befor it leaves upper attmosphere
    }

    public String toString() {
        return "Off to the space station";
    }
}
