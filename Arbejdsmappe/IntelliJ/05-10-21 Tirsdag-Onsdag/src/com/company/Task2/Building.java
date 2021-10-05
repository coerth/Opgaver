package com.company.Task2;

import java.util.Arrays;

public class Building {
     private final Room[] rooms;
     private int numberOfBathrooms;
     private int numberOfFloors;
     private boolean isOfficeBuilding;

     public Building(Room[] rooms, int numberOfBathrooms, int numberOfFloors, boolean isOfficeBuilding) {
          this.rooms = rooms;
          this.numberOfBathrooms = numberOfBathrooms;
          this.numberOfFloors = numberOfFloors;
          this.isOfficeBuilding = isOfficeBuilding;
     }

     public Room[] getRooms() {
          return rooms;
     }

     public int getNumberOfBathrooms() {
          return numberOfBathrooms;
     }

     public int getNumberOfFloors() {
          return numberOfFloors;
     }

     public boolean isOfficeBuilding() {
          return isOfficeBuilding;
     }

     @Override
     public String toString() {
          return "The building has "+ numberOfFloors+" floors. with "+numberOfBathrooms+ " bathrooms. and the following rooms:  "+Arrays.toString(rooms);
     }


}
