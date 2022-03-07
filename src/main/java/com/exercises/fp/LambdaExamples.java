package com.exercises.fp;


import java.util.function.Function;
import java.util.function.BiFunction;

public class LambdaExamples {

    public static void main(String[] args) {
        Function<Integer, Integer> absoluteValue = x -> x < 0 ? -x: x;

        //System.out.println(absoluteValue.apply(-100));

        BiFunction<Integer, Integer, Integer> add = (x , y ) -> x + y;

        System.out.println(add.apply(32, 32 ));

        TriFunction<Integer, Integer, Integer, Integer> addThree = (x, y , z) -> x + y + z;
        System.out.println(addThree.apply(1,2,3));

        NoArgsFunction<String> sayHello = () -> "Hello!!";
        System.out.println(sayHello.apply());
    }
}
