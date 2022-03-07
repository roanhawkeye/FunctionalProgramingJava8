package com.exercises.fp;

import java.util.function.BiFunction;
import java.util.function.Function;

public class HighOrderFunctions {

    public static void main(String[] args) {
        BiFunction<Float, Float, Float> divide = (x , y) -> x / y;

        Function<BiFunction<Float, Float, Float>, BiFunction<Float, Float, Float>> secondArgIsntZeroCheck =
                (funct) -> (x , y) -> {
                    if(y == 0f){
                        System.out.println("Error: Second Argument is Zero!");
                        return 0f;
                    }
                    return funct.apply(x, y);
                };

        BiFunction<Float, Float, Float> divideSafe = secondArgIsntZeroCheck.apply(divide);

        System.out.println(divideSafe.apply(10f, 0f));
        System.out.println(divideSafe.apply(10f, 2f));
    }
}
