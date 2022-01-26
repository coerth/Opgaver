public class TableEntry {

    private int rollValue;
    private final String text;

    public TableEntry(String text) {
        this.text = text;
    }

    public TableEntry(int rollValue, String text) {
        this.rollValue = rollValue;
        this.text = text;
    }

    public int getRollValue() {
        return rollValue;
    }

    public String getText() {
        return text;
    }
}
