package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Direction;
import org.academiadecodigo.carcrash.field.Position;

abstract public class Car {

    public CarFactory carFactory;
    public Direction direction;
    private Position pos;


    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {
        return false;
    }


    public Car () {
        this.pos = new Position();
        this.direction = chooseDir();
    }

    //metodo para escolher direcção e método para mover carro numa direcção

        public Direction chooseDir() {
        Direction[] dirRRAY = Direction.values();
        Direction dir = dirRRAY[(int) (Math.random() * 4)];
          return dir;

        }

        public void moveCar() {


            switch (chooseDir()) {
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

