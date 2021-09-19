package com.kelaniya.uni.v5.operation;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AddOperationTest {

    //test cases
    // positive number + positive number => 5,6 => 11
    // zero + zero => 0,0 => 0
    // negative value + negative value => -2,-4 => -6
    // negative value + positive value => -1,7 => 6

    @Test
    public void should_add_positive_values(){
        AddOperation addOperation =new AddOperation();
        Double result = addOperation.execute(new Double[]{5.0,6.0});
        assertThat(result, is(11.0));
    }

    @Test
    public void should_add_zeros_values(){
        AddOperation addOperation =new AddOperation();
        Double result = addOperation.execute(new Double[]{0.0,0.0});
        assertThat(result, is(0.0));
    }

    @Test
    public void should_add_negative_values(){
        AddOperation addOperation =new AddOperation();
        Double result = addOperation.execute(new Double[]{-1.0,-2.0});
        assertThat(result, is(11.0));
    }




}