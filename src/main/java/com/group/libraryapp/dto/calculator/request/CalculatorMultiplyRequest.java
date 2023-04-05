package com.group.libraryapp.dto.calculator.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Setter
public class CalculatorMultiplyRequest {

    private int num1;
    private int num2;
}
