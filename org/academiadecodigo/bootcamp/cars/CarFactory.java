package org.academiadecodigo.bootcamp.cars;

public class CarFactory {

    public static Car getNewCar() {


        TypeOfCar[] cARRAY = TypeOfCar.values();
        TypeOfCar car = cARRAY[(int) (Math.random() * cARRAY.length)];


        switch (car) {
            case SAXO_CUP:
                return new Saxo();
            case SEAT_IBIZA:
                return new Seat();
        }
        return null;
    }
}
