package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters
    public static Object[][] getTextData() {
        return new Object[][] {
                {21, true},
                {19, true},
                {18, true},
                {17, false},
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        CheckIsAdult checkIsAdult = new CheckIsAdult();

        boolean isAdult = checkIsAdult.isAdult(age);
        assertEquals("Пользователь - несовершенолетний", result, isAdult);
    }
}
