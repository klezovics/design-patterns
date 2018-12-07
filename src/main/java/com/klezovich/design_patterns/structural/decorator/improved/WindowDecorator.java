package com.klezovich.design_patterns.structural.decorator.improved;


public class WindowDecorator extends Window{

    protected Window window;

    public WindowDecorator(Window window) {
        this.window = window;
    }

    @Override
    public void draw() {
        window.draw();
    }
}
