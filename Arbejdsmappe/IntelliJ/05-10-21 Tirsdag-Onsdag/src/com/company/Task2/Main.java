package com.company.Task2;

public class Main {

    public static void main(String[] args) {
    //lav rum
    Room[] roomArray = {new Room(4, 3,10,5),
                        new Room(4,5,7,4),
                        new Room(4,2,4,3)};

    //lav en bygning og put rummene i
    Building bygning = new Building(roomArray,20,50,false);

    //print antal lamper i bygningen
    int lamps = 0;
    for(Room rum : bygning.getRooms()){
    lamps += rum.getNumberOfLamps();
    }
    System.out.println("The building contains this many lamps: " +lamps);

    //hvis antal etager er større end antal rum så gør følgende
    if(bygning.getNumberOfFloors() > bygning.getRooms().length){
    System.out.println("This is an odd building.");
    }

    //print toString for bygningen for også at se toString for rummene i arrayet
    System.out.println(bygning);
    }
}
