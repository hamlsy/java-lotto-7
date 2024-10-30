package lotto.validation;

public class Validation {

    private static final String NONE_INPUT_STRING = "";
    public static void validateStringToInteger(String input){
        if(!input.chars().allMatch(Character::isDigit) || input.equals(NONE_INPUT_STRING)){
            throw new IllegalArgumentException();
        }
    }
}
