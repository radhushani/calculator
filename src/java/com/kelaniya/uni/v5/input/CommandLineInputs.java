package com.kelaniya.uni.v5.input;

public class CommandLineInputs implements Inputs {

    private final String[] args;

    //Constructor of the class
    public CommandLineInputs(String[] args) {

        this.args = args;
    }

    public String getOperator() throws InvalidInputException {
        //Validation part
        if (args.length == 0) {
            throw new InvalidInputException("Please provide the operation as an argument");
        }

        String operator = args[0];
        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") || operator.equals("div"))) {
            throw new InvalidInputException("Please provide add, sub, mul or div operation as an argument");
        }
        return operator;
    }
}
