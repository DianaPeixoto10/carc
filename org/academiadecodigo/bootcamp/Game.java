package org.academiadecodigo.bootcamp;

import org.academiadecodigo.bootcamp.cars.Car;
import org.academiadecodigo.bootcamp.cars.CarFactory;
import org.academiadecodigo.bootcamp.field.Field;

public class Game {

    public static final int MANUFACTURED_CARS = 30;

    /** Container of Cars */
    private Car[] cars;

    /** Animation delay */
    private int delay;

    public Game(int cols, int rows, int delay) {

        Field.init(cols, rows);
        this.delay = delay;

    }

    /**
     * Creates a bunch of cars and randomly puts them in the field
     */
    public void init() {

        cars = new Car[MANUFACTURED_CARS];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = CarFactory.getNewCar();
        }

        Field.draw(cars);

    }

    /**
     * Starts the animation
     *
     * @throws InterruptedException
     */
    public void start() throws InterruptedException {

        while (true) {

            // Pause for a while
            Thread.sleep(delay);

            // Move all cars
            moveAllCars();

            checkCollision();

            // Update screen
            Field.draw(cars);

        }
    }
    
    public void checkCollision() {

        for (int i = 0; i < cars.length; i++) {
            for (int j = i + 1; j < cars.length; j++) {
                if (cars[i].getPos().equals(cars[j].getPos())) {
                    cars[i].setCrashed(true);
                    cars[j].setCrashed(true);
                }
            }
        }

    }


    private void moveAllCars() {

        for (int i = 0; i < cars.length; i++) {
            if (!cars[i].isCrashed()) {
                cars[i].moveCar();
            }
        }
    }
}
