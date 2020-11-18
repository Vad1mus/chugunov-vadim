package ua.oop.khpi.chugunov07;

public class Lab07 {
    public static void main(String[] args) {

        Kontainer contains = new Kontainer();
        BusStation rec1 = new BusStation();
        BusStation rec2 = new BusStation();
        rec1.generateScheduleEntry();
        contains.add(rec1);
        rec2.generateScheduleEntry();
        contains.add(rec2);
        contains.show();
    }
}
