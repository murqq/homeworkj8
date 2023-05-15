import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void shouldCalculateTotalSales() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedTotalSales = 180;

        int actualTotalSales = statsService.calculateTotalSales(sales);

        assertEquals(expectedTotalSales, actualTotalSales);
    }

    @Test
    void shouldCalculateAverageSales() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expectedAverageSales = 15;

        double actualAverageSales = statsService.calculateAverageSales(sales);

        assertEquals(expectedAverageSales, actualAverageSales);
    }

    @Test
    void shouldFindPeakMonth() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedPeakMonth = 8;

        int actualPeakMonth = statsService.calculatePeakMonth(sales);

        assertEquals(expectedPeakMonth, actualPeakMonth);
    }

    @Test
    void shouldFindMinMonth() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinMonth = 9;

        int actualMinMonth = statsService.calculateMinMonth(sales);

        assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    void shouldCountMonthsBelowAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthsBelowAverage = 5;

        int actualMonthsBelowAverage = statsService.countMonthsBelowAverage(sales);

        assertEquals(expectedMonthsBelowAverage, actualMonthsBelowAverage);
    }

    @Test
    void shouldCountMonthsAboveAverage() {
        StatsService statsService = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonthsAboveAverage = 5;

        int actualMonthsAboveAverage = statsService.countMonthsAboveAverage(sales);

        assertEquals(expectedMonthsAboveAverage, actualMonthsAboveAverage);
    }
}



