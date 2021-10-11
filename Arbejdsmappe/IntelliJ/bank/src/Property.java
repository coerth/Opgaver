public class Property extends Field{
    protected int seriesID;

    public Property(int id, String label, int cost, int income, int seriesID) {
        super(id, label, cost, income);
        this.seriesID = seriesID;
    }

    public void onAccept(){
    }

    public void onReject(){
    }

    @Override
    public String toString() {
        return "Property{" +
                "seriesID=" + seriesID +
                '}';
    }
}