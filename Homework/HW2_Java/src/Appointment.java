
/**
 * Write a description of class Appointment here.
 *
 * @author Victer Phiathep
 * @version 2/7/2024
 */
public abstract class Appointment {
    private int d; // day
    private int m; // month
    private int y; // year
    private String desc; // description

    public Appointment(int day, int month, int year, String description) {
        d = day;
        m = month;
        y = year;
        desc = description;
    }

    public abstract boolean occursOn(int inputd, int inputm, int inputy);

    // Getter methods
    public int getDay() { return d; }
    public int getMonth() { return m; }
    public int getYear() { return y; }
    public String getDesc() { return desc; }
}