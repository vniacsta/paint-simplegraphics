package org.academiadecodigo.asynctomatics.mapeditor.grid;

import org.academiadecodigo.simplegraphics.graphics.Color;

public class Cursor extends Cell {

    public enum Direction {
        RIGHT,
        LEFT,
        DOWN,
        UP;
    }

    // constructor
    public Cursor() {
        super(1, 1);
        square.setColor(Color.PINK);
        paint();
    }

    public void moveRight() {
        col++;
        square.translate(Grid.CELLSIZE, 0);
    }

    public void moveLeft() {
        col--;
        square.translate(-Grid.CELLSIZE, 0);
    }

    public void moveDown() {
        row++;
        square.translate(0, Grid.CELLSIZE);
    }

    public void moveUp() {
        row--;
        square.translate(0, -Grid.CELLSIZE);
    }
}
