package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    void shouldCalculateMonthOne() {
        VacationService service = new VacationService();

        // подготавливаем данные
        int income = 10_000;     // доход
        int expenses = 3_000;    // расходы
        int threshold = 20_000;  // сумма для отпуска
        int expected = 3;        // количество месяцев отдыха

        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateMonthTwo() {
        VacationService service = new VacationService();

        int income = 100_000;    // доход
        int expenses = 60_000;   // расходы
        int threshold = 150_000; // сумма для отпуска
        int expected = 2;        // количество месяцев отдыха

        int actual = service.calculate(income, expenses, threshold);


        Assertions.assertEquals(expected, actual);
    }
}
