package com.software_development.lesson4.Airline;

import com.software_development.lesson4.Book.Book;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class AirlineList {
    private ArrayList<Airline> airlines;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

        AirlineList(ArrayList<Airline> airlines) {

            this.airlines = airlines;
        }

        public void addAirline (String wayPoint, String planeType, Date departureTime, DaysOfWeek daysOfWeek){
            this.airlines.add(new Airline(wayPoint, planeType, departureTime, daysOfWeek));
        }

        ArrayList<Airline> getPlanesByWayPoint(String wayPoint){
            ArrayList<Airline> wayList = new ArrayList<>();
            for (Airline airline : this.airlines) {
                if (airline.getWayPoint().equalsIgnoreCase(wayPoint)) {
                    wayList.add(airline);
                }
            }
            return wayList;
        }

        ArrayList<Airline> getPlanesByDayOfWeek(DaysOfWeek daysOfWeek){
            ArrayList<Airline> publisherList = new ArrayList<>();
            for (Airline airline : this.airlines) {
                if (airline.getDaysOfWeek() == daysOfWeek) {
                    publisherList.add(airline);
                }
            }
            return publisherList;
        }

        ArrayList<Airline> getPlaneByDayOfWeekAndDepartureTime(DaysOfWeek daysOfWeek, Date dateFormat){
            ArrayList<Airline> ageList = new ArrayList<>();
            for (Airline airline : this.airlines) {
                if (airline.getDaysOfWeek() == daysOfWeek) {
                    if (airline.getDepartureTime().compareTo(dateFormat)>=0)
                    ageList.add(airline);
                }
            }
            return ageList;
        }
        public ArrayList<Airline> getAirlines() {
            return airlines;
        }

        public void setAirlines(ArrayList<Airline> airlines) {
            this.airlines = airlines;
        }
    }
