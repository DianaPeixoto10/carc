package org.academiadecodigo.bootcamp.field;

public class Position {

    private int col;
    private int row;

    //generate random col and row
    public Position() {
        this.row = (int) (Math.random() * Field.height);
        this.col = (int) (Math.random() * Field.width);
    }

    public int getCol() {
        return col;
    }

    public int getRow() {
        return row;
    }

    public boolean equals(Position position) {
            return position.getCol() == getCol() && position.getRow() == getRow();
    }

    //MÉTODO PARA ANDAR PARA A DIREITA
    public void moveRight() {
        if (col >= Field.width - 1) {
            return;
        } else {
            col = col + 1;
        }
    }

    //MÉTODO PARA ANDAR PARA A ESQUERDA
    public void moveLeft() {
        if (col <= 0) {
            return;
        } else {
            col = col - 1;
        }
    }

    //MÉTODO PARA ANDAR PARA CIMA
    public void up() {
        if (row <= 0) {
            return;
        } else {
            row = row - 1;
        }
    }

    //MÉTODO PARA ANDAR PARA BAIXO
    public void down() {
        if (row >= Field.height - 1) {
            return;
        } else {
            row = row + 1;
        }
    }

    @Override
    public String toString() {
        return "Position{" +
                "col=" + col +
                ", row=" + row +
                '}';

    }
}

