import java.util.ArrayList;

public class Sequence {
    private ArrayList<Integer> values;

    public Sequence() {
        values = new ArrayList<Integer>();
    }

    public void add(int n) {
        values.add(n);
    }

    public String toString() {
        return values.toString();
    }

    public Sequence append(Sequence other) {
        Sequence result = new Sequence();

        // Add all elements of this sequence to the new sequence
        for (int value : this.values) {
            result.add(value);
        }

        // Add all elements of the other sequence to the new sequence
        for (int value : other.values) {
            result.add(value);
        }

        return result;
    }
}
