package ru.yandex.praktikum;

public class CheckIsAdult {
    // метод, который принимает в качестве аргумента возраст
    public boolean isAdult(int age) {
        int adultAge = 18; // установим возраст совершеннолетия, с которым будем сравнивать
        return age >= adultAge; // вернём результат
    }
}
