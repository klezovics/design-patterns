package com.klezovich.design_patterns.structural.decorator;


public class ScrollbarWindow extends Window {

    @Override
    public void draw() {
        System.out.println("Draw scrollbar");
        super.draw();
    }
}
