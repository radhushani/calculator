package com.kelaniya.uni.v5.operation;


public class DivOperation implements Operation {

    public Double execute(Double[] numbers) throws InvalidOpeartionException {

        if(numbers[1]==0){
            throw new InvalidOpeartionException("Do not divide by zero");
        }
        return numbers[0] / numbers[1];
    }
}


