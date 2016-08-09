package com.mycompany.stech_junittask1;

import ru.yandex.qatools.allure.annotations.Step;


public class Arithmetic {
    @Step("Выполнение операции сложения.")
    public int AddingFunction(int a, int b){
        return a+b;
    }
    
    @Step("Выполнение операции вычитания.")
    public int SubtractionFunction(int a, int b){
        return a-b;
    }
    
    @Step("Выполнение операции умножения.")
    public int MultiplicationFunction (int a, int b){
        return a*b;
    }
    
    @Step("Выполнение операции деления.")
    public float DivisionFunction (int a, int b){
        return (float) a/b;
    }
    
    @Step("Проверка делителя.")
    public static boolean ifZero(int a) {
        return a == 0;
    }
    
}
