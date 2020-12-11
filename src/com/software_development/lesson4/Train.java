package com.software_development.lesson4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Train {

    public static void main(String[] args) throws ParseException {

        Train train[] = new Train[5];
        train[0] = new Train("Ukraine", "123", dateFormat.parse("10:25"));
        train[1] = new Train("B", "124", dateFormat.parse("11:20"));
        train[2] = new Train("Latv", "121", dateFormat.parse("12:00"));
        train[3] = new Train("Po", "125", dateFormat.parse("13:10"));
        train[4] = new Train("Russia", "198", dateFormat.parse("15:40"));


        sortingTrainNumber(train);
        System.out.println("Enter train number: ");
        Scanner scanner = new Scanner(System.in);
        String request = scanner.nextLine();
        System.out.println(sortingTrainWayPoint(train, request));
        sortTrainDestinationName(train);
        for (Train trains : train) {
            System.out.println(trains.wayPoint + " " + trains.trainNumber + " - " + dateFormat.format(trains.departureTime));
        }

    }

    private String wayPoint;
    private String trainNumber;
    private Date departureTime;
    private static SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");

    private Train(String wayPoint, String trainNumber, Date departureTime) {
        this.wayPoint = wayPoint;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    private static void sortingTrainNumber(Train[] train) {
        Train temp;
        for (int i = 0; i < train.length; i++) {

            for (int j = train.length - 1; j > i; j--) {
                if (train[i].trainNumber.compareTo(train[j].trainNumber) > 0) {
                    temp = train[i];
                    train[i] = train[j];
                    train[j] = temp;
                }
            }
        }
        for (Train value : train) {
            System.out.print(value.trainNumber);
            System.out.println();
        }
    }

    private static String sortingTrainWayPoint(Train[] train, String trainNumber) {
        for (Train trains : train) {
            if (trains.trainNumber.equals(trainNumber)) {
                return "destinationName: " + trains.wayPoint +
                        ", departure time: " + dateFormat.format(trains.departureTime);
            }
        }
        return null;
    }

    private static void sortTrainDestinationName(Train[] train) {
        Train temp;
        for (int i = 0; i < train.length; i++) {
            for (int j = train.length - 1; j > i; j--) {
                if (train[i].wayPoint.length() > train[j].wayPoint.length()) {
                    temp = train[i];
                    train[i] = train[j];
                    train[j] = temp;
                } else if (train[i].wayPoint.length() == train[j].wayPoint.length()) {
                    if (train[i].departureTime.compareTo(train[j].departureTime) > 0) {
                        temp = train[i];
                        train[i] = train[j];
                        train[j] = temp;
                    }
                }
            }
        }
    }
}
