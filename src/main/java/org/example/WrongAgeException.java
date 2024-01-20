package org.example;

public class WrongAgeException extends IllegalArgumentException{
    public WrongAgeException(String errorMessage) {
        super(errorMessage);
    }
}
