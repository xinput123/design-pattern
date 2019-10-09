package com.interpreter;

import java.util.HashMap;

/**
 * 抽象表达式类
 */
public abstract class Expression {

    public abstract int interpreter(HashMap<String, Integer> var);

}
