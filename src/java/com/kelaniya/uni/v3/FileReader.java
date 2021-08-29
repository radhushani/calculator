package com.kelaniya.uni.v3;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//this class name will be changed
public class FileReader {

    public Double[] getNumbers() throws IOException {

        //read the numbers text file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("C:\\Users\\radhushani\\Documents\\Software_construction_project\\calculator\\numbers.txt")
        );

        double number1 = Double.parseDouble((numbersStrs.get(0)));
        double number2 = Double.parseDouble((numbersStrs.get(1)));

        return new Double[]{number1, number2};

    }
}
