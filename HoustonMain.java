/**
 * Main method
 */
public class HoustonMain {

    public static void main(String[] args) {
        NasaRocket rocket = new NasaRocket(10);

        System.out.println(rocket);
        rocket.loadedRocket();
        System.out.println(rocket);
        rocket.ignitedRocket();
        System.out.println(rocket);
        rocket.liftOffRocket();
        System.out.println(rocket);
    }
}