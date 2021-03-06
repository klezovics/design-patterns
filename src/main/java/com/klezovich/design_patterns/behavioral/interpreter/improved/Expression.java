package com.klezovich.design_patterns.behavioral.interpreter.improved;


import java.util.Map;

interface Expression {
    public int interpret(Map<String,Expression> variables);
}