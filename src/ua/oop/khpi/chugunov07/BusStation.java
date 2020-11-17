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

    String[] getRoute() {
        return route;
    }


    void generateScheduleEntry() {
        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        Scanner scan3 = new Scanner(System.in);
        String[] array = null;
        int i = 0;
        int choice = 0;

        System.out.print("\nВведите номер рейса: ");
        flightNumber = scan.nextInt();
        System.out.print("\nВведите время отправления: ");
        departureTime = scan.nextLine();
        System.out.print("\nВведите день недели: ");
        dayOfTheWeek = scan.nextLine();
        System.out.print("\nВведите количество свободных мест: ");
        numberOfFreeSeats = scan.nextInt();
        /**
        System.out.print("\nВведите маршрут - Название станции и время прибытия(через запятую): ");

        while (true) {
            array[i] = scan2.nextLine();
            i++;
            System.out.print("\nОдин маршрут добавлен, добавить еще один? 1-ДА, 2-НЕТ: ");
            choice = scan3.nextInt();
            if (choice == 2) {
                break;
            }
            System.out.print("\nВведите еще один маршрут: ");
        }
        route = array;
         **/
    }
}
