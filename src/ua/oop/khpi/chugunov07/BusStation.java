package ua.oop.khpi.chugunov07;
import java.util.Scanner;

/**
 * The class that contains realization of the BusStation
 */

public class BusStation {
    private int flightNumber;      //номер рейска
    private String departureTime;  // время отправления
    private String dayOfTheWeek;   // день недели
    private int numberOfFreeSeats; // кол-во свободных мест
    private String[] route;        // маршрут (Станция, время прибытия)
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

    public void setRoute(String[] rout) {
        this.route = rout;
    }

    /**
     * The getters of our information variables
     */
    int getFlightNumber() {
        return flightNumber;
    }

    int getNumberOfFreeSeats() {
        return numberOfFreeSeats;
    }

    String getDepartureTime() {
        return departureTime;
    }

    String getDayOfTheWeek() {
        return dayOfTheWeek;
    }

    String getRouteOnIndex(int index) {
        return route[index];
    }

    String[] getRoute (){
        return route;
    }


    void generateScheduleEntry() {
        Scanner scan   = new Scanner(System.in);
        Scanner scan2  = new Scanner(System.in);
        Scanner scan3  = new Scanner(System.in);
        Scanner scan4  = new Scanner(System.in);
        Scanner scan5  = new Scanner(System.in);


        int i = 0;
        int choice = 0;

        System.out.print("\nВведите номер рейса: ");
        flightNumber = scan.nextInt();
        System.out.print("\nВведите время отправления: ");
        departureTime = scan2.nextLine();
        System.out.print("\nВведите день недели: ");
        dayOfTheWeek = scan3.nextLine();
        System.out.print("\nВведите количество свободных мест: ");
        numberOfFreeSeats = scan4.nextInt();
        System.out.print("\nВведите количество станций, которые входят в маршрут: ");
        size = scan5.nextInt();
        System.out.print("\nВведите маршрут - Название станции и время прибытия: ");
        String[] array = new String[size];

        while (i<size) {
            String info = scan2.nextLine();
            array[i] = info;
            i++;
            System.out.print("\nОдин маршрут добавлен!");
            if(i !=size){
                System.out.print("\nВведите еще один маршрут: ");
            }
        }
        route = array;
        System.out.println();

    }
}
