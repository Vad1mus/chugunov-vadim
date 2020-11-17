package ua.oop.khpi.chugunov07;
import java.util.Arrays;

public class Kontainer {

    /**
     * First size for array.
     */
    private final int size = 2;
    /**
     * Array contains all data.
     */
    private int count = 0;

    private BusStation[] massik = new BusStation[size];


    void add(final BusStation temp){
        if (count == massik.length) {
            massik = Arrays.copyOf(massik, massik.length * 2);
            massik[count++] = temp;
        } else {
            massik[count++] = temp;
        }
    }

    void show() {
        if (count == 0) {
            System.out.println("Ошибка! Пустой массив!");
        } else {
            System.out.println();
            for (int i = 0; i < count; i++) {
                System.out.println("Запись в расписании #" + (i+1));
                System.out.println("Номер рейса: " + massik[i].getFlightNumber());
                System.out.println("Время отправления: " + massik[i].getDepartureTime());
                System.out.println("День недели: " + massik[i].getDayOfTheWeek());
                System.out.println("Кол-во свободных мест: " + massik[i].getNumberOfFreeSeats());
                //System.out.println("Маршрут: " + massik[i].getRoute());
                }
           }
    }


    void clear() {
        for (int i = 0; i < count; i++) {
            massik[i] = null;
        }
        count = 0;
    }

    public void remove(int index) {
        for (int i = index; i < count; i++) {
            massik[index++] = massik[i + 1];
        }
        count--;
    }
}
