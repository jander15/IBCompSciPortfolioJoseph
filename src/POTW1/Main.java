package POTW1;

import java.util.*;

public class Main {

    public static void main(String[] args){

        //part b

        List<Integer> passengers = new ArrayList<>();
        passengers.add(100);
        passengers.add(200);
        passengers.add(1300);
        passengers.add(400);
        passengers.add(500);
        passengers.add(600);
        passengers.add(700);
        passengers.add(800);
        passengers.add(900);
        passengers.add(1000);

        int[] p_array = new int[passengers.size()];

        System.out.println(Arrays.toString(p_array));

        for (int i = 0; i < passengers.size(); i++) {
            p_array[i]=passengers.get(i);
        }
        System.out.println(Arrays.toString(p_array));

        //part c

        int maxPassengers=0;
        int maxDay=0;

        int[] averagePassengers = new int[7];
        for (int j = 0; j < p_array.length; j++) {
            averagePassengers[j%7]+=p_array[j];
        }
        //at this point averagePassengers holds the sums of each day of the week
        System.out.println(Arrays.toString(averagePassengers));


        for (int j = 0; j < 7; j++) {
            int divisor= p_array.length/7;
            if(p_array.length%7>j){
                divisor+=1;
            }
            if (divisor>0) {
                averagePassengers[j] /= divisor;
            }
            //keeping track of the day with the most passengers
            if (averagePassengers[j]>maxPassengers){
                maxPassengers=averagePassengers[j];
                maxDay=j;
            }
        }

        System.out.println(Arrays.toString(averagePassengers));
        System.out.println(convert(maxDay));

    }

    public static String convert(int day){
        switch (day){
            case 0: return "Monday";
            case 1: return "Tuesday";
            case 2: return "Wednesday";
            case 3: return "Thursday";
            case 4: return "Friday";
            case 5: return "Saturday";
            case 6: return "Sunday";
        }
        return "invalid!";
    }

}
