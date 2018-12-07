package com.klezovich.design_patterns.behavioral.visitor.improved;


public class UpgradeCarPartVisitor implements CarPartVisitor{

    @Override
    public void visit(CarPart carPart) {
        System.out.println("Upgrade: "+carPart);
    }


}