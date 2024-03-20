package com.shinyhut.vernacular.utils;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public abstract class ComponentResizeEndListener extends ComponentAdapter
        implements ActionListener {

    private final Timer timer;
    private int newWidth;
    private int newHeight;

    public ComponentResizeEndListener() {
        this(200);
    }

    public ComponentResizeEndListener(int delayMS) {
        timer = new Timer(delayMS, this);
        timer.setRepeats(false);
        timer.setCoalesce(false);
    }

    @Override
    public void componentResized(ComponentEvent e) {
        newWidth = e.getComponent().getWidth();
        newHeight = e.getComponent().getHeight();
        timer.restart();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        resizeTimedOut(newWidth, newHeight);
    }

    public abstract void resizeTimedOut(int newWidth, int newHeight);
}

