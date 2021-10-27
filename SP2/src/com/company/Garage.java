package com.company;

import java.util.ArrayList;

public class Garage {
    String name;
    ArrayList<Bil> bilArrayList = new ArrayList<>();

    public Garage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Bil> getBilArrayList() {
        return bilArrayList;
    }

    //ændret setter for at kunne tilføje biler til arrayet fremfor at overskrive hele arrayet
    public void setBilArrayList(Bil bil) {
        bilArrayList.add(bil);
    }

    @Override
    public String toString() {
        return "Garage{" + "name='" + name + '\'';
    }

    //metode som benytter et for each loop for at beregne en samlet grøn afgift
    public double beregnGrønAfgiftForBilPark(){
        double samletAfgift = 0;
        for(Bil b : bilArrayList){
           samletAfgift += b.beregnGrønEjerAfgift();
        }

        return samletAfgift;
    }
}
