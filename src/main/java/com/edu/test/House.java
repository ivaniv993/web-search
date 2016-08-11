package com.edu.test;

/**
 * Created by iivaniv on 29.07.2016.
 */
public class House {


    public int getFlatsAtFloor() {
        return flatsAtFloor;
    }

    public void setFlatsAtFloor(int flatsAtFloor) {
        this.flatsAtFloor = flatsAtFloor;
    }

    public int getFlors() {
        return flors;
    }

    public void setFlors(int flors) {
        this.flors = flors;
    }

    private int flatsAtFloor = 4;
    private int flors = 9;

    public House(int flatsAtFloor, int floors) {
        this.flatsAtFloor = flatsAtFloor;
        this.flors = floors;
    }

    public void search(int flat){

        if ( flat < 0)
            throw new IllegalArgumentException("Flat : "+flat);

        Double result = ((double)flat/(flatsAtFloor* flors));
        int entrance = result.intValue();
        if (result > entrance )
            entrance ++;

        System.out.println("Entrance : "+entrance );

        result -= result.intValue();
        Double resultFloor = (result* flors);

        int floor = resultFloor.intValue();
        if (resultFloor > floor)
            floor ++;

        System.out.println("Floor : "+ floor);

    }


}
