package org.academiadecodigo.asynctomatics.mapeditor.grid;

public class Grid {

    // fields
    public static final int PADDING = 10;
    public static final int CELLSIZE = 20;
    private int cols;
    private int rows;

    private Cell[][] cells;

    // constructor
    public Grid(int cols, int rows) {
        this.cols = cols;
        this.rows = rows;

        cells = new Cell[cols][rows];
        drawGrid();
    }

    // populate my grid
    public void drawGrid() {
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                cells[i][j] = new Cell(i, j);
            }
        }
    }

}
