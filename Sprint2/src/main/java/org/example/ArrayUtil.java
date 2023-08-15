package org.example;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayUtil {

    public Object min(int[] array){
        OptionalInt minValue = Arrays.stream(array).min();
        return minValue.isPresent() ? minValue.getAsInt() : "Array is empty";
    }

    public Object max(int[] array){
        OptionalInt maxValue = Arrays.stream(array).max();
        return maxValue.isPresent() ? maxValue.getAsInt() : "Array is empty";
    }
}
