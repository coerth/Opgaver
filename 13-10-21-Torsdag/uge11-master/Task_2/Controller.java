package Task_2;

public class Controller extends ComputeVAT{

    Dialog dialog = new Dialog();
    CalculateVat calculateVat = new CalculateVat(PRCVAT);
    View view = new View(CURRENCY,MSG);

    public void runController() {
        double userIn = dialog.doDiag();
        double moms = calculateVat.doVAT(userIn);
        view.doView(moms, MSG);
    }
}
