package org.academiadecodigo.asynctomatics.mapeditor;

import org.academiadecodigo.asynctomatics.mapeditor.grid.Cursor;
import org.academiadecodigo.asynctomatics.mapeditor.grid.Grid;
import org.academiadecodigo.asynctomatics.mapeditor.utils.KeyboardListener;

public class MapEditor {

    // fields
    private Grid grid;
    private Cursor cursor;
    private KeyboardListener keyboardListener;
    private boolean painting;

    // constructor
    public MapEditor(int cols, int rows) {
        grid = new Grid(cols, rows);
        cursor = new Cursor();
        keyboardListener = new KeyboardListener(cursor, this);
        painting = false;
    }

    public void paint() {
        if ()
    }

    public void delete() {

    }

    public void clearGrid() {

    }

    // setters
    public void setPainting(boolean painting) {
        this.painting = painting;
    }
}


