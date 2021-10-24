package ru.mirea.Practice11.Task4;

public class VariableNotFoundException extends IllegalArgumentException{
    VariableNotFoundException(String msg){
        super(msg);
    }
}
