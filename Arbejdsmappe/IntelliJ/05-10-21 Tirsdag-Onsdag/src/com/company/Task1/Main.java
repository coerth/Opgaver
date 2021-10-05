package com.company.Task1;

public class Main {

    public static void main(String[] args) {
        //lav en Driver
        Driver morten = new Driver("Morten", 32);


        //lav en Car
        Car vw = new Car("Volkswagen", "UP",2014,"Hatchback");

        //put en Driver i bilen
        vw.setDriver(morten);

        //print toString ud
        System.out.println(vw+". The car"+morten);

        //lav endnu en Car
        Car suzuki = new Car("Suzuki", "Ignis",2006,"Hatchback");

        //put den samme Driver i den nye bil
        suzuki.setDriver(morten);

        //print toString ud for den nye bil
        System.out.println(suzuki+". The car"+morten);


    }
}
