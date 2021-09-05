package com.kelaniya.uni.v4;

import com.kelaniya.uni.v4.operation.*;

//LISKOV Substitution principle
public class Main {
    public static void main(String[] args) throws Exception {

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader fileReader = new FileReader();
        Double[] numbers = fileReader.getNumbers();

        OperationFactory operationFactory = new OperationFactory();
        Operation operation = operationFactory.getInstance(operator);
        Double result = operation.execute(numbers);

        UI ui = new UI();
        ui.showMessage("The result is " + result);

    }
    //Add the division operation

}