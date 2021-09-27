package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class SubOperationTest {

    //test cases
    // positive number - positive number => 8,6 => 2
    // zero - zero => 0,0 => 0
    // negative value - negative value => -6,-4 => -2
    // negative value - positive value => -1,7 => -8

    @Test
    public void should_sub_positive_values(){
        SubOperation subOperation =new SubOperation();
        Double result = subOperation.execute(new Double[]{8.0,6.0});
        assertThat(result, is(2.0));
    }

    @Test
    public void should_sub_zeros_values(){
        SubOperation subOperation =new SubOperation();
        Double result = subOperation.execute(new Double[]{0.0,0.0});
        assertThat(result, is(0.0));
    }

    @Test
    public void should_sub_negative_values(){
        SubOperation subOperation =new SubOperation();
        Double result = subOperation.execute(new Double[]{-6.0,-4.0});
        assertThat(result, is(-2.0));
    }

    @Test
    public void should_sub_positive_and_negative_values(){
        SubOperation subOperation =new SubOperation();
        Double result = subOperation.execute(new Double[]{6.0,-4.0});
        assertThat(result, is(10.0));
    }


}