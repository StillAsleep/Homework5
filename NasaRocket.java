/**
 * NasaRocket
 */
public class NasaRocket {

    NasaRocketState unLoaded;
    NasaRocketState loaded;
    NasaRocketState rocketIgnition;
    NasaRocketState liftOffState;

    NasaRocketState state;

    int count = 0;

    public NasaRocket(int countdown) {
        unLoaded = new Unloaded(this);
        loaded = new Loaded(this);
        rocketIgnition = new RocketIgnition(this);
        liftOffState = new LiftOffState(this);

        this.count = countdown;

        if (countdown > 10) {
            state = unLoaded;
            countdown--;
        } else {
            state = loaded;
        }
    }

    public void setRocketState(NasaRocketState state) {
        this.state = state;
    }

    public void emptyRocket() {
        state.empty();
    }

    public void loadedRocket() {
        state.ready();
        count = 10;
    }

    public void ignitedRocket() {
        state.ignition();
    }

    public void liftOffRocket() {
        state.liftOff();
        while (count != 0) {
            count--;
        }
    }

    public int getCount() {

        return count;
    }

    public NasaRocketState getUnloadedState() {
        return unLoaded;
    }

    public NasaRocketState getLoadedState() {
        return loaded;
    }

    public NasaRocketState getIgninRocketState() {
        return rocketIgnition;
    }

    public NasaRocketState getRocketLiftOffState() {
        return liftOffState;
    }

    public String toString() {

        StringBuffer result = new StringBuffer();
        result.append("\nNASA Space Exploration\n");
        result.append("Rocket is " + count + " seconds from liftoff!\n");
        result.append("Rocket is currently " + state + ".");

        return result.toString();
    }
}