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

    // E7.20: Append method
    public Sequence append(Sequence other) {
        Sequence result = new Sequence();
        for (int value : this.values) {
            result.add(value);
        }
        for (int value : other.values) {
            result.add(value);
        }
        return result;
    }

    // E7.21: Merge method
    public Sequence merge(Sequence other) {
        Sequence result = new Sequence();
        int i = 0, j = 0;
        while (i < this.values.size() && j < other.values.size()) {
            result.add(this.values.get(i++));
            result.add(other.values.get(j++));
        }
        // Add remaining elements
        while (i < this.values.size()) {
            result.add(this.values.get(i++));
        }
        while (j < other.values.size()) {
            result.add(other.values.get(j++));
        }
        return result;
    }

    public static void main(String[] args) {
        // Test the Sequence class
        Sequence a = new Sequence();
        a.add(1);
        a.add(4);
        a.add(9);
        a.add(16);

        Sequence b = new Sequence();
        b.add(9);
        b.add(7);
        b.add(4);
        b.add(9);
        b.add(11);

        Sequence appended = a.append(b);
        Sequence merged = a.merge(b);

        System.out.println("Sequence a: " + a);
        System.out.println("Sequence b: " + b);
        System.out.println("Appended sequence: " + appended);
        System.out.println("Merged sequence: " + merged);
    }
}
