package com.exercises.fp;

public class Closure {

    public static void main(String[] args) {
        NoArgsFunction<NoArgsFunction<String>> createGreeter = () -> {
            String name = "Daniel";
            return () -> "Hello " + name;
        };

        NoArgsFunction<String> greeter = createGreeter.apply();
        System.out.println(greeter.apply());
    }
}
