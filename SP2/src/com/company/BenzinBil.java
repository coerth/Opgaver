package com.company;

//nedarver fra super-klassen Bil
public class BenzinBil extends  Bil{

    private int octanTal;
    private int kmPrLiter;


    //konstruktøren for BenzinBil skal indeholde de variabler som er i super-klassen Bil
    public BenzinBil(String regNr, String mærke, String model, int årgang, int antalDøre, int octanTal, int kmPrLiter) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.octanTal = octanTal;
        this.kmPrLiter = kmPrLiter;
    }


    public int getOctanTal() {
        return octanTal;
    }

    public void setOctanTal(int octanTal) {
        this.octanTal = octanTal;
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
       s += "BenzinBil{" + "octanTal=" + octanTal +", kmPrLiter=" + kmPrLiter +'}';
        return s;
    }

    //metode til at udregne grøn ejer afgift af bilen
    @Override
    public double beregnGrønEjerAfgift() {
        double ejerAfgift = 0;

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

        return ejerAfgift;
    }
}
