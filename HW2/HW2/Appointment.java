
/**
 * Write a description of class Appointment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Appointment
{
    private int d;
    private int m;
    private int y;
    private String desc;
    
    public Appointment(int a, int b, int c, String description)
    {
        d=a;
        m=b;
        y=c;
        desc = description;
    }

    public boolean occursOn(int inputd, int inputm, int inputy)
    {
        
    }
}
