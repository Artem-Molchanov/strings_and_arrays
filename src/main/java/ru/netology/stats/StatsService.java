package ru.netology.stats;


public class StatsService {

    public int sumAllSales(int[] monthSales) {

        int sumSales = 0;
        for (int i = 0; i < monthSales.length; ++i) {
            sumSales = sumSales + monthSales[i];
        }
        return sumSales;
    }


    public int averageAllSales(int[] monthSales) {

        int averageSales = sumAllSales(monthSales) / monthSales.length;
        return averageSales;
    }

    public int maxSales(int[] monthSales) {
        int maxMonth = 0;

        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] >= monthSales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(int[] monthSales) {
        int minMonth = 0;

        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] <= monthSales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int underSalesMonthAverage(int[] monthSales) {

        int averageSales = averageAllSales(monthSales);
        int minAverageSales = 0;

        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] < averageSales) {
                minAverageSales++;
            }
        }
        return minAverageSales;

    }

    public int aboveSalesMonthAverage(int[] monthSales) {

        int averageSales = averageAllSales(monthSales);
        int maxAverageSales = 0;

        for (int i = 0; i < monthSales.length; i++) {
            if (monthSales[i] > averageSales) {
                maxAverageSales++;
            }
        }
        return maxAverageSales;

    }


}