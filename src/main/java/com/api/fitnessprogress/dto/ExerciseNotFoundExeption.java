package com.api.fitnessprogress.dto;

public class ExerciseNotFoundExeption extends Exception{
    public ExerciseNotFoundExeption(String message){
        super(message);
    }
}
