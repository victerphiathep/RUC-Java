
/**
 * Write a description of class Onetime here.
 *
 * @author Victer Phiathep
 * @version 2/7/2024
 */
public class Onetime extends Appointment {
    public Onetime(int day, int month, int year, String description) {
        super(day, month, year, description);
    }

    @Override
    public boolean occursOn(int inputd, int inputm, int inputy) {
        return getDay() == inputd && getMonth() == inputm && getYear() == inputy;
    }
}
