package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatsServiceTest {
    long[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    //@Test
      /* public void sumSale() {    // сумма всех продаж, задача 1
        long expected = 180;
        long actual = service.sumSale(monthSales);
        assertEquals(expected, actual);
    }*/

    // упрoщение, укорочение теста
    @Test
    public void sumSale() {    // сумма всех продаж, задача 1
        assertEquals(180, service.sumSale(monthSales));
    }

   /* @Test
    public void averageMonthlySales() {   // Средняя сумма продаж в месяц, задача 2
        long expected = 15;
        long actual = service.averageMonthlySales(monthSales);
        assertEquals(expected, actual);
    }*/

    // упрoщение, укорочение теста
    @Test
    public void averageMonthlySales() {   // Средняя сумма продаж в месяц, задача 2
        assertEquals(15, service.averageMonthlySales(monthSales));
    }

   /* @Test
    public void maxSales() {    // номер месяца max продаж, задача 3
        long expected = 8;
        long actual = service.maxSales(monthSales);
        assertEquals(expected, actual);
    }*/

    // упрoщение, укорочение теста
    @Test
    public void maxSales() {    // номер месяца max продаж, задача 3
        assertEquals(8, service.maxSales(monthSales));
    }

   /* @Test
    public void minSales() {    // номер месяца min продаж, задача 4
        long expected = 9;
        long actual = service.minSales(monthSales);
        assertEquals(expected, actual);
    }*/

    // упрoщение, укорочение теста
    @Test
    public void minSales() {    // номер месяца min продаж, задача 4
        assertEquals(9, service.minSales(monthSales));
    }

   /* @Test
    public void numberMonthsLowSales() {    // Количество месяцев продажи ниже среднего, задача 5
        long expected = 5;
        long actual = service.numberMonthsLowSales(monthSales);
        assertEquals(expected, actual);
    }*/

    // упрoщение, укорочение теста
    @Test
    public void numberMonthsLowSales() {    // Количество месяцев продажи ниже среднего, задача 5
        assertEquals(5, service.numberMonthsLowSales(monthSales));
    }

    /*@Test
    public void numberMonthsHidhSales() {    // Количество месяцев продажи выше среднего, задача 6
        long expected = 5;
        long actual = service.numberMonthsHidhSales(monthSales);
        assertEquals(expected, actual);
    }*/

    // упрoщение, укорочение теста
    @Test
    public void numberMonthsHidhSales() {    // Количество месяцев продажи выше среднего, задача 6
        assertEquals(5, service.numberMonthsHidhSales(monthSales));
    }
}





