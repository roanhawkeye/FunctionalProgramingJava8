package com.exercises.fp;

public interface TriFunction<T,U,V,R> {
    R apply(T t, U u, V v);
}
