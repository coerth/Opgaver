package Task_2;

public class View {
    private String CURRENCY;
    private String MSG;

    public View(String CURRENCY, String MSG) {
        this.CURRENCY = CURRENCY;
        this.MSG = MSG;
    }

    public void doView(double result, String typeOfResult){
        System.out.printf("Du betaler %.2f%3s i %s%n",result, CURRENCY,MSG);
    }
}
