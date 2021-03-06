package com.mycompany.stech_junittask1;

import static com.mycompany.stech_junittask1.Arithmetic.ifZero;
import static com.mycompany.stech_junittask1.Data.getDataFromFile;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import ru.yandex.qatools.allure.annotations.*;

@Title("Тест выражений с оператором деления")
@Description("Проверка результата арифметического действия.")
@RunWith(value = Parameterized.class)
public class DivisionOperatorParameterizeTest {
    private final int operand1;
    private final int operand2;
    private final String operator;
    private final float expectedResult;
 
    public DivisionOperatorParameterizeTest(final String A, final String B, final String Oper, final String C) {
        this.operand1 = Integer.parseInt(A);
        this.operand2 = Integer.parseInt(B);
        this.operator = Oper;
        this.expectedResult = Float.parseFloat(C);
    }
    
    @Parameterized.Parameters(name = "Тест №{index}: Проверка, что ({0}{2}{1})={3}")
    public static List<Object[]> testData() {
        return getDataFromFile("/");
    }
    
    @Description("Проверяется арифметическое действие над двумя операндами. "
            + " Реальный результат арифметического действия сравнивается с данными из тестового файла, "
            + "на основе чего делается вывод о корректности тестового выражения.")
    @Features("Арифметические действия")
    @Stories("Оператор деления")
    @Step("Проверка результата вычислений.")
    @Test
    public void ParameterizeTest() {
        if (ifZero(operand2)) {
            fail("expected <" + expectedResult +  ">. Error: Div by zero");
        } else {
            assertEquals((float) expectedResult, new Arithmetic().DivisionFunction(operand1,operand2), 0.0001);
        }
    }
}
