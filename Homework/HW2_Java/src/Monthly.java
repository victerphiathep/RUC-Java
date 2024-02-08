
/**
 * Write a description of class Monthly here.
 *
 * @author Victer Phiathep
 * @version 2/7/2024
 */
public class Monthly extends Appointment {
    public Monthly(int day, int month, int year, String description) {
        super(day, month, year, description);
    }

    @Override
    public boolean occursOn(int inputd, int inputm, int inputy) {
        return getMonth() == inputm;
    }
}