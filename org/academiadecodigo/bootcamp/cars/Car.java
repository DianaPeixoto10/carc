package org.academiadecodigo.bootcamp.cars;

import org.academiadecodigo.bootcamp.field.Direction;
import org.academiadecodigo.bootcamp.field.Position;

abstract public class Car {

    public CarFactory carFactory;
    public Direction direction;
    private Position pos;
    private boolean isCrashed;
    private int dirCounter;

    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return isCrashed;
    }

    public void setCrashed(boolean crashed) {
        isCrashed = crashed;
    }

    public Car() {
        this.pos = new Position();
        this.direction = chooseDir();
        this.dirCounter = 0;
    }

    //metodo para escolher direcção e método para mover carro numa direcção

    public Direction chooseDir() {
        Direction[] dirRRAY = Direction.values();
        Direction dir = dirRRAY[(int) (Math.random() * 4)];
        return dir;
    }

    public void moveCar() {

        if (dirCounter == 10) {
            direction = chooseDir();
            dirCounter = 0;
        } else { dirCounter++; }

        switch (direction) {
            case RIGHT:
                pos.moveRight();
                break;
            case LEFT:
                pos.moveLeft();
                break;
            case UP:
                pos.up();
                break;
            case DOWN:
                pos.down();
                break;
        }
    }
}



//MÉTODO PARA A VELOCIDADE

