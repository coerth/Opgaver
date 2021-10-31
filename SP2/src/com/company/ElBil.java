package com.company;

public class ElBil extends Bil{
    private int batteriKapacitetKW;
    private int maxKM;
    private int wPrKM;

    //konstruktøren for ElBil skal indeholde de variabler som er i super-klassen Bil
    public ElBil(String regNr, String mærke, String model, int årgang, int antalDøre, int batteriKapacitetKW, int maxKM, int wPrKM) {
        super(regNr, mærke, model, årgang, antalDøre);
        this.batteriKapacitetKW = batteriKapacitetKW;
        this.maxKM = maxKM;
        this.wPrKM = wPrKM;
    }


    public int getBatteriKapacitetKW() {
        return batteriKapacitetKW;
    }

    public void setBatteriKapacitetKW(int batteriKapacitetKW) {
        this.batteriKapacitetKW = batteriKapacitetKW;
    }

    public int getMaxKM() {
        return maxKM;
    }

    public void setMaxKM(int maxKM) {
        this.maxKM = maxKM;
    }

    public int getwPrKM() {
        return wPrKM;
    }

    public void setwPrKM(int wPrKM) {
        this.wPrKM = wPrKM;
    }

    //for at have de informationer fra super-klassen med, så skal vi hente toString metoden fra super-klassen
    @Override
    public String toString() {
        String s = super.toString();
        s += "ElBil{" +
                "batteriKapacitetKW=" + batteriKapacitetKW +
                ", maxKM=" + maxKM +
                ", wPrKM=" + wPrKM +
                '}';
        return s;
    }

    @Override
    public double beregnGrønEjerAfgift() {
        double ejerAfgift = 0;
        //formlen for at omregne watt pr km til km pr liter
        double kmPrLiter = 100 / (wPrKM / 91.25);


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
