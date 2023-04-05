package com.group.libraryapp.dto.calculator.request;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class CalculatorMultiplyRequest {

    private final int num1;
    private final int num2;

    public CalculatorMultiplyRequest(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
}
