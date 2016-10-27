package com.edu.test;

import com.edu.test.House;

import java.util.Arrays;
import java.util.List;

/**
 * Created by iivaniv on 29.07.2016.
 */
public class Test {

//    public static void main(String[] args) {
//
//        int flats = 4;
//        int floor = 9;
//        int entrance = 4;
//
//        House house = new House(flats, floor);
//        House house1 = new House(6, 4);
//        House house2 = new House(7, 9);
//        House house3 = new House(5, 8);
//
//        List< House > houses = Arrays.asList(house, house1, house2, house3 );
//
//        houses.stream().filter((e) -> e.getFlatsAtFloor() > 5).forEach((e) -> System.out.println(e.getFlatsAtFloor()));

//        house.search(36);
//        house.search(40);
//        house.search(41);
//
//        System.out.println("-----------------------");
//        System.out.println("SUM : "+ numericSum(19, 22));
//
//        String s2 = "s";
//        String s1 = new String("s");
//        s1.intern();
//        System.out.println(s1==s2); ;
//    }

    private static int numericSum( int from, int to ){

        if ( from > to ) throw new IllegalArgumentException("Wrong parameters : "+from+" > "+to);

        int result = 0;
        while ( from <= to){

            int buf = from;
            int curSum = 0;

            while( buf >= 1 ){
                curSum += buf % 10;
                buf = buf / 10;

            }
            result += curSum;
            from++;
        }

        return result;
    }

}
