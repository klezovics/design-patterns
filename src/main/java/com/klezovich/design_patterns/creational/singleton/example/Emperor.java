package com.klezovich.design_patterns.creational.singleton.example;

/**
 * This is the evil Emperor, all shall bow to his power...
 */
public class Emperor {


    /**
     * Private constructor so we must pass via the awake method.
     */
    private Emperor(){

    }

    /**
     * Awakes the Emperor and returns it.
     *
     * @return the emperor
     */
    public static Emperor awake(){
        return new Emperor();
    }


}
