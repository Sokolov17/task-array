package com.sokolov.task1.validator;

public class ArrayValidator {

    private static final String STRING_ARRAY_REGEX="[\\d*(\\s|[\\s\\-\\s]|[\\,\\s])*]*";

    public static boolean validateString(String line) {
        boolean valid=line.matches(STRING_ARRAY_REGEX);
        return valid;
    }

}
