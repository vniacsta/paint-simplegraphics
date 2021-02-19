package org.academiadecodigo.asynctomatics.mapeditor.utils;

import org.academiadecodigo.asynctomatics.mapeditor.MapEditor;
import org.academiadecodigo.asynctomatics.mapeditor.grid.Cursor;
import org.academiadecodigo.simplegraphics.keyboard.Keyboard;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEventType;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class KeyboardListener implements KeyboardHandler {

    // fields
    private Cursor cursor;
    private MapEditor game;

    // constructor
    public KeyboardListener(Cursor cursor, MapEditor game) {
        this.cursor = cursor;
        this.game = game;
        setup();
    }

    public void setup() {

        Keyboard keyboard = new Keyboard(this);

//        KeyboardEvent[] events = new KeyboardEvent[10];
//
//        for (KeyboardEvent event : events) {
//            event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
//
//            switch (event.setKeyboardEventType(KeyboardEventType.KEY_PRESSED)) {
//                case event.KEY_RIGHT():
//                    return new KeyboardEvent();
//
//
//            }
//        }

        KeyboardEvent right = new KeyboardEvent();
        right.setKey(KeyboardEvent.KEY_RIGHT);
        right.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(right);

        KeyboardEvent left = new KeyboardEvent();
        left.setKey(KeyboardEvent.KEY_LEFT);
        left.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(left);

        KeyboardEvent up = new KeyboardEvent();
        up.setKey(KeyboardEvent.KEY_UP);
        up.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(up);

        KeyboardEvent down = new KeyboardEvent();
        down.setKey(KeyboardEvent.KEY_DOWN);
        down.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(down);

        KeyboardEvent space = new KeyboardEvent();
        space.setKey(KeyboardEvent.KEY_SPACE);
        space.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(space);

        KeyboardEvent xKey = new KeyboardEvent();
        xKey.setKey(KeyboardEvent.KEY_X);
        xKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(xKey);

        KeyboardEvent cKey = new KeyboardEvent();
        cKey.setKey(KeyboardEvent.KEY_M);
        cKey.setKeyboardEventType(KeyboardEventType.KEY_PRESSED);
        keyboard.addEventListener(cKey);
    }

    @Override
    public void keyPressed(KeyboardEvent keyboardEvent) {

        switch (keyboardEvent.getKey()) {

            case KeyboardEvent.KEY_RIGHT:
                cursor.moveRight();
                break;
            case KeyboardEvent.KEY_LEFT:
                cursor.moveLeft();
                break;
            case KeyboardEvent.KEY_DOWN:
                cursor.moveDown();
                break;
            case KeyboardEvent.KEY_UP:
                cursor.moveUp();
                break;
            case KeyboardEvent.KEY_SPACE:
                game.setPainting(true);
                cursor.paint();
                break;
            case KeyboardEvent.KEY_C:
                game.clearGrid();
                break;
        }
    }

    @Override
    public void keyReleased(KeyboardEvent keyboardEvent) {

        if (keyboardEvent.getKey() == KeyboardEvent.KEY_SPACE) {
            game.setPainting(false);
        }
    }
}
