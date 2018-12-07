package com.klezovich.design_patterns.behavioral.iterator.improved;


public interface Iterator<T> {

    T getNext();

    boolean isDone();

}
