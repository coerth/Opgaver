public class Start extends Consequence {

    public Start(int id, String label, int cost, int income) {

        super(id, label, cost, income);
    }

    @Override
    public String onLand() {
        String s = super.onLand();
        onPassed();

        return s;
    }

    public void onPassed(){

    }

}
