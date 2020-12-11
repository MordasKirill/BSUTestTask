package com.software_development.lesson4.Airline;

import com.software_development.lesson4.Book.Book;
import com.software_development.lesson4.Book.BookList;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Runner {
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
    public static void main(String[] args) throws ParseException {
        AirlineList airlineList = new AirlineList(new ArrayList<>());

        airlineList.addAirline("Rome", "Ил-96", dateFormat.parse("10:25"), DaysOfWeek.MONDAY);
        airlineList.addAirline("Minsk", "Boeing 737-300", dateFormat.parse("10:40"), DaysOfWeek.THURSDAY);
        airlineList.addAirline("London", "Boeing 737-800NG", dateFormat.parse("12:35"), DaysOfWeek.WEDNESDAY);
        airlineList.addAirline("Moscow", "Airbus A330", dateFormat.parse("13:50"), DaysOfWeek.FRIDAY);
        airlineList.addAirline("New York", "Boeing 747", dateFormat.parse("19:10"), DaysOfWeek.SUNDAY);

        System.out.println("Airlines by way point:");
        ArrayList<Airline> wayPoint = airlineList.getPlanesByWayPoint("Moscow");
        for (Airline airline : wayPoint) {
            System.out.println(airline);
        }

        System.out.println("Airlines by the day of week:");
        ArrayList<Airline> dayOfWeek = airlineList.getPlanesByDayOfWeek(DaysOfWeek.MONDAY);
        for (Airline airline : dayOfWeek) {
            System.out.println(airline);
        }

        System.out.println("Airlines by the day of week and departure time: ");
        ArrayList<Airline> departureTime = airlineList.getPlaneByDayOfWeekAndDepartureTime(DaysOfWeek.SUNDAY, dateFormat.parse("19:10"));
        for (Airline airline : departureTime) {
            System.out.println(airline);
        }
    }

}
