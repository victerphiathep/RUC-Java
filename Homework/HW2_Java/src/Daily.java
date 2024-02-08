
/**
 * Write a description of class Daily here.
 *
 * @author Victer Phiathep
 * @version 2/7/2024
 */
public class Daily extends Appointment {
    public Daily(int day, int month, int year, String description) {
        super(day, month, year, description);
    }

    @Override
    public boolean occursOn(int inputd, int inputm, int inputy) {
        return getDay() == inputd;
    }
}