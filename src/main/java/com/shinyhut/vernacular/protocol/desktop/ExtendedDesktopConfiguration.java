package com.shinyhut.vernacular.protocol.desktop;

import java.util.List;

public class ExtendedDesktopConfiguration {
    int x;
    int y;
    int width;
    int height;
    int numberOfScreens;

    private Screen[] screens;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getNumberOfScreens() {
        return numberOfScreens;
    }

    public void setNumberOfScreens(int numberOfScreens) {
        this.numberOfScreens = numberOfScreens;
    }

    public Screen[] getScreens() {
        return screens;
    }

    public void setScreens(Screen[] screens) {
        this.screens = screens;
    }
}
