package com.kelaniya.uni.v5.operation;

//Abstract class or Interface class -> Interface
public interface Operation {
    Double execute(Double[] numbers) throws InvalidCalcOpeartionException;
}

//interface class is better for THIS situation