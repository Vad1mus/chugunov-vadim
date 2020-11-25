package ua.oop.khpi.chugunov07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


/**
 * Bus Station class.
 * Class defines the entity of a special task.
 * Schedule entries that contains of flightNumber,departureTime etc.
 */
public class BusStation {
    private int flightNumber;      // A flight number in Schedule
    private String departureTime;  // departure time of the bus
    private String dayOfTheWeek;   // day of the week when the bus travels
    private int numberOfFreeSeats; // count of free seats in bus
    private String[] route;        // The bus route (name of station, arrival time)
    int size = 0;

    /**
     * The setters of our information variables
     */

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setDayOfTheWeek(String dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public void setNumberOfFreeSeats(int numberOfFreeSeats) {
        this.numberOfFreeSeats = numberOfFreeSeats;
    }

    public void setRoute(String[] route) {
        this.route = route;
    }

    /**
     * Adding stations in the route.
     * @param stationNum - the number of stations
     * @throws IOException - if there is any unresolved input/output
     */
    public void enterRoute(int stationNum) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        this.route = new String[stationNum];
        System.out.println("Введите " + stationNum + " станций");
        String getRouteName;
        for (int i = 0; i < stationNum; i++) {
            System.out.print((i + 1) + ". ");
            getRouteName = reader.readLine();
            this.route[i] = getRouteName;
        }
    }

    /**
     * The getters of our information variables
     */
    public  int getFlightNumber() {
        return flightNumber;
    }

    public int getNumberOfFreeSeats() {
        return numberOfFreeSeats;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    public String getRouteOnIndex(int index) {
        return route[index];
    }

    public String[] getRoute (){
        return route;
    }

    /**
     Default constructor
     */
    public BusStation() {
        flightNumber = 0;
        departureTime = null;
        dayOfTheWeek = null;
        numberOfFreeSeats = 0;
        route = null;
    }

    @Override
    public String toString() {
        return  "Номер рейса: " + flightNumber + "\n" +
                "Время отправления: " + departureTime + '\n' +
                "День недели: " + dayOfTheWeek + '\n' +
                "Кол-во свободных мест: " + numberOfFreeSeats + '\n' +
                "Маршрут: " + Arrays.toString(route);
    }

}

