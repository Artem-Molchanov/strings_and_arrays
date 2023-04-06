package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestStartService {

    @Test //1

    public void shouldTestSumAllSales() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSum = 180;
        int actualSum = service.sumAllSales(monthSales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test //2

    public void shouldTestAverageAllSales() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectAverage = 15;
        int actualAverage = service.averageAllSales(monthSales);

        Assertions.assertEquals(expectAverage, actualAverage);

    }

    @Test //3

    public void shouldTestMaxPeakMonthSales() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMax = 8;
        int actualMax = service.maxSales(monthSales);

        Assertions.assertEquals(expectMax, actualMax);

    }

    @Test //4

    public void shouldTestMaxWeakMonthSales() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectMin = 9;
        int actualMin = service.minSales(monthSales);

        Assertions.assertEquals(expectMin, actualMin);

    }

    @Test //5

    public void shouldTestUnderAverageMonthSales() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectUnderAverage = 5;
        int actualUnderAverage = service.underSalesMonthAverage(monthSales);

        Assertions.assertEquals(expectUnderAverage, actualUnderAverage);

    }

    @Test //6

    public void shouldTestAboveAverageMonthSales() {
        StatsService service = new StatsService();

        int[] monthSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectAboveAverage = 5;
        int actualAboveAverage = service.aboveSalesMonthAverage(monthSales);

        Assertions.assertEquals(expectAboveAverage, actualAboveAverage);

    }
}
