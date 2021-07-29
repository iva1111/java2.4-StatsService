package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void sumSale() {    // сумма всех продаж, задача 1
        StatsService service = new StatsService();

        long expected = 180;
        long actual = service.sumSale(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    public void AverageMonthlySales() {   // Средняя сумма продаж в месяц, задача 2
        StatsService service = new StatsService();

        long expected = 15;
        long actual = service.AverageMonthlySales(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    public void maxSales() {    // номер месяца max продаж, задача 3
        StatsService service = new StatsService();

        long expected = 8;
        long actual = service.maxSales(monthSales);

        assertEquals(expected, actual);
    }


    @Test
    public void minSales() {    // номер месяца min продаж, задача 4
        StatsService service = new StatsService();

        long expected = 9;
        long actual = service.minSales(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsLowSales() {    // Количество месяцев продажи ниже среднего, задача 5
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.numberMonthsLowSales(monthSales);

        assertEquals(expected, actual);
    }

    @Test
    public void numberMonthsHidhSales() {    // Количество месяцев продажи выше среднего, задача 6
        StatsService service = new StatsService();

        long expected = 5;
        long actual = service.numberMonthsHidhSales(monthSales);

        assertEquals(expected, actual);
    }

}





