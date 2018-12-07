package com.klezovich.design_patterns.structural.decorator.improved;


public class IconWindowDecorator extends WindowDecorator{

    public IconWindowDecorator(Window window) {
        super(window);
    }

    @Override
    public void draw() {
        System.out.println("Drawing icon");
        window.draw();
    }
}
