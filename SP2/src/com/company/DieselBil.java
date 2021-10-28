package com.company;

public class DieselBil extends Bil{
    private boolean partikelFilter;
    private int kmPrLiter;

    //konstruktøren for DieselBil skal indeholde de variabler som er i super-klassen Bil
    public DieselBil(String regNr, String mærke, String model, int årgang, int antalDøre, boolean partikelFilter, int kmPrLiter) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.partikelFilter = partikelFilter;
        this.kmPrLiter = kmPrLiter;
    }


    public boolean isPartikelFilter() {
        return partikelFilter;
    }

    public void setPartikelFilter(boolean partikelFilter) {
        this.partikelFilter = partikelFilter;
    }

    public int getKmPrLiter() {
        return kmPrLiter;
    }

    public void setKmPrLiter(int kmPrLiter) {
        this.kmPrLiter = kmPrLiter;
    }

    //for at have de informationer fra super-klassen med, så skal vi hente toString metoden fra super-klassen
    @Override
    public String toString() {
       String s = super.toString();
       s += "DieselBil{" +
               "partikelFilter=" + partikelFilter +
               ", kmPrLiter=" + kmPrLiter +
               '}';
        return s;
    }

    //metode til at udregne grøn ejer afgift af bilen
    @Override
    public double beregnGrønEjerAfgift() {
        double ejerAfgift = 0;
        double udligningsAfgift;
        int udledningsAfgift = 1000;

        if(kmPrLiter < 50 && kmPrLiter > 20){
            ejerAfgift = 330;
        }

        else if(kmPrLiter < 20 && kmPrLiter > 15){
            ejerAfgift = 1050;
        }

        else if(kmPrLiter < 15 && kmPrLiter > 10){
            ejerAfgift = 2340;
        }

        else if(kmPrLiter < 10 && kmPrLiter > 5){
            ejerAfgift = 5500;
        }

        else if(kmPrLiter < 5){
            ejerAfgift = 10470;
        }

        //hvis ikke bilen har et partikelfilter skal 1000kr ligges til afgift
        if(!partikelFilter){
            ejerAfgift += udledningsAfgift;
        }

        udligningsAfgift = beregnUdligningsAfgift();
        ejerAfgift += udligningsAfgift;

        return ejerAfgift;
    }

    //metode til at udregne udligningsafgift da den skal ligges til den grønne afgift
    public double beregnUdligningsAfgift() {
        double udligningsAfgift = 0;

        if(kmPrLiter < 50 && kmPrLiter > 20){
            udligningsAfgift = 130;
        }

        else if(kmPrLiter < 20 && kmPrLiter > 15){
            udligningsAfgift = 1390;
        }

        else if(kmPrLiter < 15 && kmPrLiter > 10){
            udligningsAfgift = 1850;
        }

        else if(kmPrLiter < 10 && kmPrLiter > 5){
            udligningsAfgift = 2770;
        }

        else if(kmPrLiter < 5){
            udligningsAfgift = 15260;
        }

        return udligningsAfgift;
    }
}
