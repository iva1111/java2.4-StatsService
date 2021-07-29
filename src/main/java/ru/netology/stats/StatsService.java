package ru.netology.stats;

public class StatsService {

    public long sumSale(long[] sales) {  // сумма всех продаж, задача 1
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public long AverageMonthlySales(long[] sales) {    // Средняя сумма продаж в месяц, задача 2
        long average = sumSale(sales) / sales.length;
        return average;
    }


    public long maxSales(long[] sales) {     // номер месяца max продаж, задача 3
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public long minSales(long[] sales) {    // номер месяца min продаж, задача 4
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long numberMonthsLowSales(long[] sales) { // Количество месяцев продажи ниже среднего, задача 5
        long months = 0;
        long average = AverageMonthlySales(sales);
        for (long sale : sales) {
            if (sale < average) {
                months += 1;
            }
        }
        return months;
    }

    public long numberMonthsHidhSales(long[] sales) { // Количество месяцев продажи ниже среднего, задача 5
        long months = 0;
        long average = AverageMonthlySales(sales);
        for (long sale : sales) {
            if (sale > average) {
                months += 1;
            }
        }
        return months;
    }


}

