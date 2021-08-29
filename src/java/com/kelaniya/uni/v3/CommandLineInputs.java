package com.kelaniya.uni.v3;

public class CommandLineInputs {

    private final String[] args;

    //Constructor of the class
    public CommandLineInputs(String[] args) {

        this.args = args;
    }

    public String getOperator() {
        //Validation part
        if (args.length == 0) {
            System.out.println("Please provide the operation as an argument");
            return "";//will change in the future
        }

        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("div") || operator.equals("mul"))) {
            System.out.println("Please provide add,sub or mul as the operator argument.");
            return "";//will change in the future
        }
        return operator;
    }
}
