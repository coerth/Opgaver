package øvelse5;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MinBrugerDialog minBrugerDialog = new MinBrugerDialog();

        ArrayList<String> menu = new ArrayList<>();

        menu.add("Agurk");
        menu.add("Tomat");
        menu.add("Salat");

        minBrugerDialog.menuValg(menu);

    }
}
